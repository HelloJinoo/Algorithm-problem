/* BEAKJOON 2302 ���� �¼�
 * VIP�¼��� ������, �ڱ��� �ٷ� ���� �¼� �Ǵ� �ٷ� ������ �¼����δ� �ڸ��� �ű� �� �ִ�.
 * ������� �¼��� ���� �� �ִ� ����� �������� ���
 */
package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2302 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int seat = Integer.parseInt(br.readLine());  //�¼���
		 int vip_count = Integer.parseInt(br.readLine()); //VIP�¼���
		 int count =1; //�ڸ� ��ġ ��� ��
		 
		 
		 boolean seat_array[] = new boolean[seat+1]; //�¼� ��ġ 
		 int dp[] = new int[seat+1];
		 dp[1] = 1;
		 
		 for(int v=0; v<vip_count; v++) {
			 int vip_seat = Integer.parseInt(br.readLine());  //vip�¼� �Է�
			 seat_array[vip_seat] = true;
		 }
		 /*�� �¼��� ���ڸ� �� ���*/
		 if(seat == 1) {
			 System.out.println(count);
		 }
		 else {  //���ڸ� �̻� �� ���
			 dp[2] = 2;
			 /*�ڸ� ��ġ ����� �� */
			 for(int i=3; i<dp.length; i++) {
				 dp[i] = dp[i-1] + dp[i-2];
			 }
			 /*vip������ �¼� Ȯ��*/
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


