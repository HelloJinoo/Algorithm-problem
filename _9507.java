/* baekjoon 9507 
 * Generations of Tribbles
 * 꿍만의 피보나치 함수가 koong(n)이라고 할 때,
 * n < 2 :                         1
 * n = 2 :                         2
 * n = 3 :                         4
 * n > 3 : koong(n − 1) + koong(n − 2) + koong(n − 3) + koong(n − 4)
 */
package Back;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9507 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		long dp[] = new long[68];
		for(int i=0; i<dp.length; i++) {
			if( i <2 ) {
				dp[i] = 1;
			}
			else if(i ==2) {
				dp[i] = 2;
			}
			else if(i ==3) {
				dp[i] = 4;
			}
			else {
				dp[i] = dp[i-1] + dp[i-2] + dp[i-3]+ dp[i-4];
			}
		}
	
		for(int i=0; i<test; i++) {
			int input = Integer.parseInt(br.readLine());
			System.out.println(dp[input]);
		}
	}
}
