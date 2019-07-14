import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class B_7576 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int y = Integer.parseInt(input[0]);
		int x = Integer.parseInt(input[1]);
		Queue q = new LinkedList<Pair>();

		//-1 갯수
		// 1 갯수
		String[][] tomato = new String[x][y];
		boolean[][] visited = new boolean[x][y];
		boolean isAdd = false;
		for(int row=0; row<x; row++) {
			tomato[row] = br.readLine().split(" ");
		}
		int level = 0;
		
		/*초기 토마토가 있는 상자의 위치 queue에 넣기*/
		for(int row=0; row<tomato.length; row++) {
			for(int col=0; col<tomato[row].length; col++) {
				if(tomato[row][col].equals("1")) {
					Pair p = new Pair(row,col);
					visited[row][col] = true;
					q.add(p);
					isAdd = true;
				}
			}
		}
		
		
	if(alltomato(tomato)) {
		System.out.println(0);
	}
	else {
			/*확인*/
		while(isAdd) {	
				isAdd = false;
				Queue q2 = new LinkedList<Pair>();
				while(!q.isEmpty()) {
					Pair p = (Pair) q.poll();
					
					//아래
					if(p.x + 1 < tomato.length && visited[p.x+1][p.y] == false && tomato[p.x+1][p.y].equals("0") ) {
						visited[p.x+1][p.y] = true;
						tomato[p.x+1][p.y] = "1";
						Pair q2_add = new Pair(p.x+1, p.y); 
						q2.add(q2_add);
					}
					
					//위
					if(p.x -1 >= 0 && visited[p.x-1][p.y] == false && tomato[p.x-1][p.y].equals("0")  ) {
						visited[p.x-1][p.y] = true;
						Pair q2_add = new Pair(p.x-1, p.y); 
						 tomato[p.x-1][p.y] = "1";
						q2.add(q2_add);
					}
					
					//오른쪽
					if(p.y + 1 < tomato[p.x].length && visited[p.x][p.y+1] == false && tomato[p.x][p.y+1].equals("0")) {
						visited[p.x][p.y+1] = true;
						Pair q2_add = new Pair(p.x, p.y+1); 
						tomato[p.x][p.y+1] = "1";
						q2.add(q2_add);
					}
					
					//왼쪽
					if(p.y -1 >=0 && visited[p.x][p.y-1] == false && tomato[p.x][p.y-1].equals("0") ) {
						visited[p.x][p.y-1] = true;
						tomato[p.x][p.y-1] = "1";
						Pair q2_add = new Pair(p.x, p.y-1); 
						q2.add(q2_add);
					}
				}
				while(!q2.isEmpty()) {
					q.add(q2.poll());
					isAdd = true;
				}
				if(isAdd) {
					level++;
				}
		 }
		
		if(alltomato(tomato)) {
			System.out.println(level);
		}
		else {
			System.out.println("-1");
		}
	 }
		
	}
	
	static class Pair{
		private int x; 
		private int y;
		public Pair(int x , int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	/*토마토가 모두 번식했는지 확인하는 메소드*/
	static public boolean alltomato(String[][] box) {
		for(int row=0; row<box.length; row++) {
			for(int col=0; col<box[row].length; col++) {
				if(box[row][col].equals("0")) {
					return false;
				}
			}
		}
		return true;
	}
}
