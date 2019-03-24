package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class B_2178 {

	
	static int n;
	static int m;
	static int mincount= Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		 n = Integer.parseInt(input[0]);
		 m = Integer.parseInt(input[1]);
		int[][] miro = new int[n][m];
		boolean[][] visited = new boolean[n][m];
		Queue<Pair> q = new LinkedList<>();
		
		/*미로에 대한 정보 입력*/
		for(int i=0; i<n; i++) {
			String info[] = br.readLine().split(""); //각각의 미로 행
			
			for(int in=0; in<info.length; in++) {
				miro[i][in] = Integer.parseInt(info[in]);
			}
			
		}
		Pair p = new Pair(0,0);
		q.add(p);
		search(q , visited , miro);
		System.out.println(mincount);
		
		

	}
	
	static public void search( Queue<Pair> q , boolean[][] v , int[][] mi) {
		
		while(!q.isEmpty()) {  //Q가 빌때 까지
			Pair p = q.poll(); //Q에서 하나 빼와서
			v[p.x][p.y] = true;	//현재 지점 방문 ok
			
			//위로 갈수 있을 경우
			if(  p.x-1 >= 0 && mi[p.x-1][p.y] ==1 && v[p.x-1][p.y] == false) {  
				Pair pa = new Pair(p.x-1 , p.y);  //위지점 좌표 생성
				mi[p.x-1][p.y] = mi[p.x][p.y]+1;  //이동 횟수 증가
				q.add(pa);				
			}
			if( p.x+1 < v.length && mi[p.x+1][p.y] ==1  && v[p.x+1][p.y] == false) {  //아래로 갈수 있을 경우
				if( p.x+1 == n-1 && p.y == m-1) {   //최종 지점 주변에 도착 하였을 때 현재 방문 횟수 비교
					if( mincount > mi[p.x][p.y]+1 ) {	//최단 이동거리로 
						mincount = mi[p.x][p.y]+1 ;
						}
					}
				else {
					Pair pa = new Pair(p.x+1 , p.y);   //아래지점 좌표 생성 
					mi[p.x+1][p.y] = mi[p.x][p.y]+1; 
					q.add(pa);
				}
			}
			if(  p.y-1 >=0 &&  mi[p.x][p.y-1] ==1 && v[p.x][p.y-1] == false) {  //왼쪽으로 갈수 있을 경우
				Pair pa = new Pair(p.x , p.y-1);  //왼쪽지점 좌표 생성
				mi[p.x][p.y-1] = mi[p.x][p.y]+1;  
				q.add(pa);
				
			}
			if(  p.y+1 <v[0].length && mi[p.x][p.y+1] ==1 && v[p.x][p.y+1] == false) { //오른쪽으로 갈수 있을 경우
				if( p.x == n-1 && p.y+1 == m-1) {
					if( mincount > mi[p.x][p.y]+1 ) {
						mincount = mi[p.x][p.y]+1 ;
						}
					}
				else {
					Pair pa = new Pair(p.x , p.y+1);
					mi[p.x][p.y+1] = mi[p.x][p.y]+1; 
					q.add(pa);
				}
				
			}
			
		}
	}
	
	/*좌표 쌍*/
	static public class Pair{
		 int x;
		 int y;
		public  Pair(int x,  int y ){
			 this.x=x;
			 this.y=y;
		 }
	}

}
