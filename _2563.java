package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2563 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int range[][] = new int[101][101];
		int count=0;

		for(int i=0; i<T; i++) {
			String line[] = br.readLine().split(" ");
			int x = Integer.parseInt(line[0]);
			int y = Integer.parseInt(line[1]);
			
			for(int indexx=x; indexx<Integer.parseInt(line[0])+10; indexx++) {
				for(int indexy=y; indexy<Integer.parseInt(line[1])+10; indexy++) {
					range[indexx][indexy] =1;
				}
			}
		}

		for(int i=0; i<range.length; i++) {
			for(int j=0; j<range.length; j++) {
				if( range[i][j] == 1) {
				count++;
				}
			}
		}
		
		System.out.println(count);
	}
		
	}


