/* Baekjoon 5575
 * Ÿ�� ī��
 * �ٹ� �ð� ����
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
		int start_h = Integer.parseInt(time[0]);  //���(��)
		int start_m = Integer.parseInt(time[1]);  //���(��)
		int start_s = Integer.parseInt(time[2]);  //���(��)
		
		int end_h = Integer.parseInt(time[3]);   //���(��)
		int end_m = Integer.parseInt(time[4]);   //���(��)
		int end_s = Integer.parseInt(time[5]);   //���(��)
		
		if( start_s > end_s) {  //���(��)> ���(��)
			end_s +=60;   // ��� �п��� ��� �ʿ� 60�� �ֱ�
			end_m -= 1;
		}
		
		if( start_m > end_m) {	//���(��)> ���(��)
			end_m +=60;	  // ��� �ÿ��� ��� �п� 60�� �ֱ�
			end_h -=1;
		}
		
		System.out.println((end_h-start_h)+" "+(end_m-start_m)+" "+(end_s-start_s));
		
	}

}
