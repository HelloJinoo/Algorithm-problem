package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2579 {


	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
	
		int array[] = new int[N];
		String line;
		int dp[] = new int[N];

		for (int i = 0; i < array.length; i++) {
			line = br.readLine();
			array[i] = Integer.parseInt(line);		
		}
		
		
		dp[0] = array[0];
	    dp[1] = Max(array[0]+array[1],array[1]);
	    dp[2] = Max(array[0]+array[2],array[1]+array[2]);
	 
	    for (int i = 3; i < array.length; i++) {
	        dp[i] = Max(dp[i-2]+array[i], array[i-1]+array[i]+dp[i-3]);
	    }
	    
	    System.out.println(dp[array.length-1]);
	}
	
	
	public static int Max(int a , int b ) {
		return a> b ? a:b;
	}
	
}
