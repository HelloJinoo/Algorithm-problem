/* Baekjoon 14501
 * 퇴사
 * 퇴사전 백준이 얻을 수 있는 최대 수익
 */
package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _14501 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int schedule_count = Integer.parseInt(br.readLine()); //schdule_count+1일 째에 퇴사
		int schedule[][] = new int[schedule_count+1][2];
		int dp[] = new int[schedule_count+1];
	
		for(int i=1; i <= schedule_count; i++) {
			String input[] = br.readLine().split(" ");
			schedule[i][0] = Integer.parseInt(input[0]);  //상담 기간
			schedule[i][1] = Integer.parseInt(input[1]);  //상담 이익
		}
		dp[1] = schedule[1][1];
		
		for(int i=2; i<dp.length; i++) {
			for(int j=i-1; j>0; j--) {
				if( j + schedule[j][0] > i ) { //진행중인 상담이 있음
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
			if( i+schedule[i][0]-1 <= schedule_count) { //상담종료가 퇴사일보다 더 오래걸리는지 확인
				if(dp[i] > max) {	//최대 수익 확인
					max = dp[i];
				}
			}
		}
		System.out.println(max);
	}

}
