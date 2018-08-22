package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9506 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
	
		while( N != -1) {
			int sum = 0;
			int count=0;
			for(int i=1; i<N; i++) {
				if( N % i ==0) {
					sum += i;
					count++;
				}
			}
			if( sum == N) {
				System.out.print( sum +" = ");
				int pluscount=0;
				for(int i=1; i<N; i++) {
					if( N % i ==0) {
						System.out.print(i);
						if( count-1 != pluscount) {
							pluscount++;
							System.out.print(" + ");
						}
						else {
							System.out.println();
						}
					}
				}

			}
			else {
				System.out.println(N + " is NOT perfect.");
			}
			
			N = Integer.parseInt(br.readLine());
		}

	}

}
