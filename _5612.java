/* Baekjoon 5612
 * �ͳ��� �Ա��� �ⱸ
 * ���� �����ϰ� j���� ���� ���� (j = 0~n)���� �ͳ� �ȿ� �ִ� ������ ���� �ִ�
 */

package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5612 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int time = Integer.parseInt(br.readLine());
		int car_count = Integer.parseInt(br.readLine());
		int max_count = 0;
		
		int comp=0;
		for(int i=0; i<time; i ++) {
			String input[] = br.readLine().split(" ");
			int enter = Integer.parseInt(input[0]); //�Ա��� ����� ���� ��
			int exit = Integer.parseInt(input[1]); //�ⱸ�� ����� ���� ��
			
			car_count += (enter - exit);
			if( car_count < 0 ) {
				comp = -1; //������ �߻��� ��� 0���� ��� 
				break;
			}
			else {
				if(max_count < car_count) { //���� ���� ���� �� ���� Ȯ��
					max_count = car_count;
				}
			}
		}
		
		/*���*/
		if( comp == -1) {
			System.out.println("0");
		}
		else {
			System.out.println(max_count);
		}
	}

}
