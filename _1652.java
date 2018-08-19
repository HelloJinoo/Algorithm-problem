package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1652 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		char room[][] = new char[N][N];
		
		for(int i=0; i<N; i++) {
			String line = br.readLine();
			for(int j=0; j<line.length(); j++) {
				room[i][j] = line.charAt(j);
			}
		}
		
		int row=0;
		int col=0;
		int rowcount=0;
		int colcount=0;
		for(int i=0; i<room.length; i++) {
			for(int j=0; j<room.length; j++) {
				if( room[i][j] == '.') {
					rowcount++;
				}
				else if(room[i][j] == 'X') {
						if( rowcount >=2) {
							row++;
						}
						rowcount=0;
					}
				
			 }	
			if( rowcount >=2) {
				row++;
			}
			rowcount=0;
		}
		
		for(int i=0; i<room.length; i++) {
			for(int j=0; j<room.length; j++) {
				if( room[j][i] == '.') {
					colcount++;
					
				}
				else if(room[j][i] == 'X') {
					if( colcount >=2) {
						col++;
					}
						colcount=0;	
				}
			 }
			if( colcount >=2) {
				col++;
			}
			colcount=0;
		}
		System.out.println(row+" "+ col);
		

	}

}
