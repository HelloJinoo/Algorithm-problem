package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9465 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		
		
		for(int test=0; test<T; test++) {
			
			int n = Integer.parseInt(br.readLine());
			int score[][] = new int[2][n];
			int dp[][] = new int[2][n];
			
			for(int i=0; i<2; i++) {
				String line[] = br.readLine().split(" ");
				for(int index=0; index<n; index++) {
					score[i][index] = Integer.parseInt(line[index]);
				}
			}
			
			dp[0][0]= score[0][0];
			dp[1][0]= score[1][0];
			
			for(int i=1; i<n; i++) {
				if(i ==1) {
					dp[0][i] = dp[1][0] + score[0][1];
					dp[1][i] = dp[0][0] + score[1][1];
				}
				else {
					if(dp[1][i-2] >dp[1][i-1]) {
						dp[0][i] = dp[1][i-2] + score[0][i];
					}
					else {
						dp[0][i] = dp[1][i-1] + score[0][i];
					}
					
					if(dp[0][i-2] >dp[0][i-1]) {
						dp[1][i] = dp[0][i-2] + score[1][i];
					}
					else {
						dp[1][i] = dp[0][i-1] + score[1][i];
					}
				}
			}
		
			if(dp[0][dp[0].length-1] > dp[1][dp[1].length-1]) {
				System.out.println(dp[0][dp[0].length-1]);
			}
			else {
				System.out.println(dp[1][dp[1].length-1]);
			}
		}
	}

}
