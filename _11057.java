/*	baekjoon 11057
 * 	오르막 수
 *  2234와 11119는 오르막 수 / 2232 91111은 오르막 수 x
 *  길이 n의 오르막 수의 갯수
 */
package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11057 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] dp = new int[10];
		
		/*한자리 수 일때 초기화*/
		for(int i=0; i<dp.length; i++) {
			dp[i] = 1;
		}
	  
		/*n-1번반복 , n자리수 일때 알기*/
		for (int j = 1; j < N; j++) {
		    for (int i = 1; i < 10; i++) {
		    	dp[i] = (dp[i] + dp[i-1]) % 10007;
		         }
		   }
		long sum = 0;
		for (int i = 0; i < 10; i++) {
	         sum += dp[i];
	      }
	      System.out.println(sum % 10007);
		   }

}
