/* baekjoon 11722 
 * ���� �� �����ϴ� �κ� ����
 * ���� A = {10, 30, 10, 20, 20, 10}�� ��쿡 ���� �� �����ϴ� �κ� ������ A = {30, 20, 10}�̰�, ���̴� 3
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

		for(int i=1; i<input.length; i++) { //�Էµ� ���� ���Ͽ� 
			for(int j = i-1; j>=0; j--) { //�տ��ִ� ��� ���� ���Ͽ� �����ϴ� ���� ���� ã��
				if(Integer.parseInt(input[j]) > Integer.parseInt(input[i])) {
					int value= dp[j]+1;
					if(dp[i] < value ) {  //���� �� �����ϴ� �κм��� 
						dp[i] = value;
					}
					if(max < dp[i]) {  //ū �� ���� ã��
						max = dp[i];
					}
				}
			}

		}
		System.out.println(max);
	}
}
