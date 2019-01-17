/* Baekjoon 9084
 * 동전
 * 동전의 종류가 주어질 때에 주어진 금액을 만드는 모든 방법
 */

package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class _9084 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test =Integer.parseInt(br.readLine()); //테스트케이스 수
		
		for(int t=0; t<test; t++) {
			int coin_count =Integer.parseInt(br.readLine()); //동전의 수
			String str_coin[] = br.readLine().split(" "); //입력받은 동전 가치
			int coin[] = new int[coin_count]; //Integer형 동전 가치
			
			int make_value = Integer.parseInt(br.readLine());
			int dp[] = new int[make_value+1];
			
			for(int i=0; i<coin.length; i++) {
				coin[i] = Integer.parseInt(str_coin[i]);
			}
			dp[0] = 1;
			for (int i = 0; i < coin_count; i++) {	//각각의 동전으로 
                for (int j = coin[i]; j <= make_value; j++) { 
                    dp[j] += dp[j - coin[i]];	//나머지 돈을 만들수 있는 경우의 수 
                }
            }
			System.out.println(dp[make_value]);
			
		}
	}

}
