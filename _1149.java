package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1149 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int min =0;
		int a[][] = new int[N][3];
		int dp[][] = new int[N][3];
	
		
		for(int i=0; i<N; i++) {
			String line = br.readLine();
			String array[] = line.split(" ");
			for(int j=0; j<3; j++) {
			 a[i][j] = Integer.parseInt(array[j]);
			}
		}
		
		dp[0][0] = a[0][0];
		dp[0][1] = a[0][1];
		dp[0][2] = a[0][2];
		
		for(int i=1; i<N; i++) {
			dp[i][0] = Min(dp[i-1][1], dp[i-1][2] ) +  a[i][0];
			dp[i][1] = Min(dp[i-1][0], dp[i-1][2] ) +  a[i][1];
			dp[i][2] = Min(dp[i-1][0], dp[i-1][1] ) +  a[i][2];
		}
		
		System.out.println(Min(Min(dp[N-1][0] , dp[N-1][1]) , dp[N-1][2]));
		
	}
	public static int Min(int a, int b) {
		return a > b ? b : a ;
	}

}
