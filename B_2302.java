/* BEAKJOON 2302 극장 좌석
 * VIP좌석을 제외한, 자기의 바로 왼쪽 좌석 또는 바로 오른쪽 좌석으로는 자리를 옮길 수 있다.
 * 사람들이 좌석에 앉을 수 있는 방법의 가짓수를 출력
 */
package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2302 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int seat = Integer.parseInt(br.readLine());  //좌석수
		 int vip_count = Integer.parseInt(br.readLine()); //VIP좌석수
		 int count =1; //자리 배치 방법 수
		 
		 
		 boolean seat_array[] = new boolean[seat+1]; //좌석 배치 
		 int dp[] = new int[seat+1];
		 dp[1] = 1;
		 
		 for(int v=0; v<vip_count; v++) {
			 int vip_seat = Integer.parseInt(br.readLine());  //vip좌석 입력
			 seat_array[vip_seat] = true;
		 }
		 /*총 좌석이 한자리 일 경우*/
		 if(seat == 1) {
			 System.out.println(count);
		 }
		 else {  //두자리 이상 일 경우
			 dp[2] = 2;
			 /*자리 배치 경우의 수 */
			 for(int i=3; i<dp.length; i++) {
				 dp[i] = dp[i-1] + dp[i-2];
			 }
			 /*vip사이의 좌석 확인*/
			 int check_count=0;
			 for(int check=1; check<seat_array.length; check++) {
				 if(seat_array[check] == false) {
					 check_count++;
					 if(check == seat_array.length -1 ) {
						 count *= dp[check_count];
					 }
				 }
				 else {  
					if(check_count != 0) {
						count *= dp[check_count];
						check_count = 0;
					}
				 }
			 }
				
				 
				 
			 }
			 System.out.println(count);
		 }
		 
	}


