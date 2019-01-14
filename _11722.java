/* baekjoon 11722 
 * 가장 긴 감소하는 부분 수열
 * 수열 A = {10, 30, 10, 20, 20, 10}인 경우에 가장 긴 감소하는 부분 수열은 A = {30, 20, 10}이고, 길이는 3
 */
package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11722 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String input[]=  br.readLine().split(" ");
		int dp[] = new int[N];
		
		int max = 1 ;
		for(int i=0; i<dp.length; i++) {
			dp[i] = 1;
		}

		for(int i=1; i<input.length; i++) { //입력된 수에 대하여 
			for(int j = i-1; j>=0; j--) { //앞에있는 모든 수에 대하여 감소하는 수의 갯수 찾기
				if(Integer.parseInt(input[j]) > Integer.parseInt(input[i])) {
					int value= dp[j]+1;
					if(dp[i] < value ) {  //가장 긴 감소하는 부분수열 
						dp[i] = value;
					}
					if(max < dp[i]) {  //큰 값 가장 찾기
						max = dp[i];
					}
				}
			}

		}
		System.out.println(max);
	}
}
