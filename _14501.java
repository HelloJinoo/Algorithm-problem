/* Baekjoon 14501
 * ���
 * ����� ������ ���� �� �ִ� �ִ� ����
 */
package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _14501 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int schedule_count = Integer.parseInt(br.readLine()); //schdule_count+1�� °�� ���
		int schedule[][] = new int[schedule_count+1][2];
		int dp[] = new int[schedule_count+1];
	
		for(int i=1; i <= schedule_count; i++) {
			String input[] = br.readLine().split(" ");
			schedule[i][0] = Integer.parseInt(input[0]);  //��� �Ⱓ
			schedule[i][1] = Integer.parseInt(input[1]);  //��� ����
		}
		dp[1] = schedule[1][1];
		
		for(int i=2; i<dp.length; i++) {
			for(int j=i-1; j>0; j--) {
				if( j + schedule[j][0] > i ) { //�������� ����� ����
					if(dp[i] < schedule[i][1]) {
						dp[i] = schedule[i][1];
					}
				}
				else {
					if(dp[i] < dp[j] + schedule[i][1]) { 
						dp[i] = dp[j] + schedule[i][1];
					}
				}
				
			}
		}
		int max = 0;
		for(int i=1; i<dp.length; i++) {
			if( i+schedule[i][0]-1 <= schedule_count) { //������ᰡ ����Ϻ��� �� �����ɸ����� Ȯ��
				if(dp[i] > max) {	//�ִ� ���� Ȯ��
					max = dp[i];
				}
			}
		}
		System.out.println(max);
	}

}
