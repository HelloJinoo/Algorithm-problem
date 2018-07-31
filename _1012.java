package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1012 {

	static int square[][];
	static boolean visited[][];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			String line[] = br.readLine().split(" ");
			int count=0;
			
			 square = new int[Integer.parseInt(line[1])][Integer.parseInt(line[0])];
			 visited = new boolean[Integer.parseInt(line[1])][Integer.parseInt(line[0])];
			int cabbage = Integer.parseInt(line[2]);
			
			for(int j=0; j<cabbage; j++) {
				String location[] = br.readLine().split(" ");
				square[Integer.parseInt(location[1])][Integer.parseInt(location[0])] = 1;
			}
			
			
			for(int l=0; l<square.length; l++) {
				for(int o=0; o<square[l].length; o++) {
					 if( square[l][o] == 1 && visited[l][o] == false) {
						visited[l][o] = true;
						connect(l,o);
							count++;
						}
				}
			}
			System.out.println(count);		
		}


	}
	public static void connect(int i , int j) {
		if( i-1 >=0 && square[i-1][j] ==1 && visited[i-1][j] == false) { //╩С
			visited[i-1][j] = true;
			connect(i-1,j);
		}
		if( i+1 < square.length && square[i+1][j] ==1 && visited[i+1][j] == false) { //го
			visited[i+1][j] = true;
			 connect(i+1,j);
		}
		if( j-1 >=0 && square[i][j-1] ==1 && visited[i][j-1] == false) { //аб
			visited[i][j-1] = true;
			 connect(i,j-1);
		}
		if( j+1 < square[i].length && square[i][j+1] ==1 && visited[i][j+1] == false) { //©Л
			visited[i][j+1] = true;
			 connect(i,j+1);
		}
		
			
		
		
	}

}
