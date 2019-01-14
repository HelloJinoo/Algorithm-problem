/*	baekjoon 11057
 * 	������ ��
 *  2234�� 11119�� ������ �� / 2232 91111�� ������ �� x
 *  ���� n�� ������ ���� ����
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
		
		/*���ڸ� �� �϶� �ʱ�ȭ*/
		for(int i=0; i<dp.length; i++) {
			dp[i] = 1;
		}
	  
		/*n-1���ݺ� , n�ڸ��� �϶� �˱�*/
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
