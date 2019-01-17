/* Baekjoon 9084
 * ����
 * ������ ������ �־��� ���� �־��� �ݾ��� ����� ��� ���
 */

package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class _9084 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test =Integer.parseInt(br.readLine()); //�׽�Ʈ���̽� ��
		
		for(int t=0; t<test; t++) {
			int coin_count =Integer.parseInt(br.readLine()); //������ ��
			String str_coin[] = br.readLine().split(" "); //�Է¹��� ���� ��ġ
			int coin[] = new int[coin_count]; //Integer�� ���� ��ġ
			
			int make_value = Integer.parseInt(br.readLine());
			int dp[] = new int[make_value+1];
			
			for(int i=0; i<coin.length; i++) {
				coin[i] = Integer.parseInt(str_coin[i]);
			}
			dp[0] = 1;
			for (int i = 0; i < coin_count; i++) {	//������ �������� 
                for (int j = coin[i]; j <= make_value; j++) { 
                    dp[j] += dp[j - coin[i]];	//������ ���� ����� �ִ� ����� �� 
                }
            }
			System.out.println(dp[make_value]);
			
		}
	}

}
