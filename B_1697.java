import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class B_1697 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Queue q = new LinkedList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");

		int x = Integer.parseInt(input[0]);	//시작지점
		int k = Integer.parseInt(input[1]);	//도착지점
		boolean visited[] = new boolean[100001];
		q.add(x);
		visited[x] = true;
		if(x > k ) {
			System.out.println(x - k );
		}
		else {
			
			System.out.println(bfs( k , visited , 0 , q));
		}
		
	}

	private static int bfs(int k, boolean[] visited,  int level , Queue<Integer> q) {
			Queue q2 = new LinkedList<Integer>();
			while(!q.isEmpty()) {
			int current_position = q.poll();
			if(current_position == k ) {
				return level;
				}
			else {
				q2.add(current_position);
			 }
			}
			while(!q2.isEmpty()) {
			int posi = (int)q2.poll();
				if( posi-1 >= 0 && visited[posi-1] == false ) {
							visited[posi-1] = true;
							q.add(posi-1);
				}
				if( posi+1 < visited.length && visited[posi+1] == false ) {
							visited[posi+1] = true;
							q.add(posi+1);
				}
				if( posi*2 < visited.length && visited[posi*2] == false ) {
							visited[posi*2] = true;
							q.add(posi*2);
				}
			}
			return bfs( k, visited, level+1 , q);
		}
		
		
	}
	

