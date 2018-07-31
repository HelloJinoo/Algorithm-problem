package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1010 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i < T; i++) {
			String line =br.readLine();
			String line2[] = line.split(" ");
			int N = Integer.parseInt(line2[0]);
			int M = Integer.parseInt(line2[1]);
			
			long dp[][] = new long[N+1][M+1];
			for(int k=1; k<M+1; k++) {
				dp[1][k] = k;
			}
			
		for(int j=2; j<N+1; j++) {
			for(int k=2; k<M+1; k++) {
				if( j == k ) {
					dp[j][k] = 1;
				}
				else {
					int w = k-1;
					while(j-1 <= w) {
						dp[j][k] += dp[j-1][w];
						w--;
					}
					
				}
			}
		}
		System.out.println(dp[N][M]);
		}

	}
	
}
