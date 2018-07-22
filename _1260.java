package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _1260 {
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String one = br.readLine();
		String one2[] = one.split(" ");
		
		int vertex = Integer.parseInt(one2[0]);
		int line = Integer.parseInt(one2[1]);
		int start = Integer.parseInt(one2[2]);
		

		boolean visited[] = new boolean[vertex+1];
		boolean map[][] = new boolean[vertex+1][vertex+1];
			 
		for(int i=0; i<line; i++) {
			String two = br.readLine();
			String two2[] = two.split(" ");
			 map[Integer.parseInt(two2[0])][Integer.parseInt(two2[1])] = true;
			 map[Integer.parseInt(two2[1])][Integer.parseInt(two2[0])] = true;
		}
		
		
		/*DFS*/
		Stack<Integer> s= new Stack();
		
		s.push(start);
		visited[start] = true;
		System.out.print(start +" ");
		
		while( !s.empty() ) {
			int start2= -1;
			int next = s.peek();
			for(int i=1; i<map[next].length; i++) {
				if(visited[i] == false && map[next][i] ==true) {
					visited[i] = true;
					s.push(i);
					System.out.print( i + " ");
					start2 = i;
					break;
				}
			}
			if( start2 == -1){
				s.pop();
			}
		}
	
		for(int i=0; i<visited.length; i++) {
			visited[i] = false;
		}
		
		System.out.println();
		
	
	
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		visited[start] = true;
		System.out.print(start +" ");
		
		while( !q.isEmpty() ) {
			
			int next = q.peek();
			for(int i=1; i<map[next].length; i++) {
				if(visited[i] == false && map[next][i] ==true) {
					q.add(i);
					visited[i] = true;
					System.out.print( i + " ");
				}
			}
			q.poll();
		}
	
	}

	
}
