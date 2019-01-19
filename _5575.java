/* Baekjoon 5575
 * 타임 카드
 * 근무 시간 측정
 */
package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5575 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0; i<3; i++) {
			String time[] = br.readLine().split(" ");
			calculate_time(time);
		}
		
	}

	private static void calculate_time(String[] time) {
		int start_h = Integer.parseInt(time[0]);  //출근(시)
		int start_m = Integer.parseInt(time[1]);  //출근(분)
		int start_s = Integer.parseInt(time[2]);  //출근(초)
		
		int end_h = Integer.parseInt(time[3]);   //퇴근(시)
		int end_m = Integer.parseInt(time[4]);   //퇴근(분)
		int end_s = Integer.parseInt(time[5]);   //퇴근(초)
		
		if( start_s > end_s) {  //출근(초)> 퇴근(초)
			end_s +=60;   // 퇴근 분에서 퇴근 초에 60초 주기
			end_m -= 1;
		}
		
		if( start_m > end_m) {	//출근(분)> 퇴근(분)
			end_m +=60;	  // 퇴근 시에서 퇴근 분에 60분 주기
			end_h -=1;
		}
		
		System.out.println((end_h-start_h)+" "+(end_m-start_m)+" "+(end_s-start_s));
		
	}

}
