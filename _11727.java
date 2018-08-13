package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11727 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int dp[] = new int[N+1];
		dp[1] = 1;
		for(int i=2; i<dp.length; i++ ) {
			if( i==2) {
				dp[i] =3; 
			}
			else {
				dp[i] = (2*dp[i-2] + dp[ i-1] ) %10007;
			}
		}
		
		System.out.println(dp[N]);
	}

}
