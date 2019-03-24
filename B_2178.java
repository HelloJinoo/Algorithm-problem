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
		
		/*�̷ο� ���� ���� �Է�*/
		for(int i=0; i<n; i++) {
			String info[] = br.readLine().split(""); //������ �̷� ��
			
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
		
		while(!q.isEmpty()) {  //Q�� ���� ����
			Pair p = q.poll(); //Q���� �ϳ� ���ͼ�
			v[p.x][p.y] = true;	//���� ���� �湮 ok
			
			//���� ���� ���� ���
			if(  p.x-1 >= 0 && mi[p.x-1][p.y] ==1 && v[p.x-1][p.y] == false) {  
				Pair pa = new Pair(p.x-1 , p.y);  //������ ��ǥ ����
				mi[p.x-1][p.y] = mi[p.x][p.y]+1;  //�̵� Ƚ�� ����
				q.add(pa);				
			}
			if( p.x+1 < v.length && mi[p.x+1][p.y] ==1  && v[p.x+1][p.y] == false) {  //�Ʒ��� ���� ���� ���
				if( p.x+1 == n-1 && p.y == m-1) {   //���� ���� �ֺ��� ���� �Ͽ��� �� ���� �湮 Ƚ�� ��
					if( mincount > mi[p.x][p.y]+1 ) {	//�ִ� �̵��Ÿ��� 
						mincount = mi[p.x][p.y]+1 ;
						}
					}
				else {
					Pair pa = new Pair(p.x+1 , p.y);   //�Ʒ����� ��ǥ ���� 
					mi[p.x+1][p.y] = mi[p.x][p.y]+1; 
					q.add(pa);
				}
			}
			if(  p.y-1 >=0 &&  mi[p.x][p.y-1] ==1 && v[p.x][p.y-1] == false) {  //�������� ���� ���� ���
				Pair pa = new Pair(p.x , p.y-1);  //�������� ��ǥ ����
				mi[p.x][p.y-1] = mi[p.x][p.y]+1;  
				q.add(pa);
				
			}
			if(  p.y+1 <v[0].length && mi[p.x][p.y+1] ==1 && v[p.x][p.y+1] == false) { //���������� ���� ���� ���
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
	
	/*��ǥ ��*/
	static public class Pair{
		 int x;
		 int y;
		public  Pair(int x,  int y ){
			 this.x=x;
			 this.y=y;
		 }
	}

}
