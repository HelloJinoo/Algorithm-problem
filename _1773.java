/* Baekjoon 1773
 * firecracker show
 * ���׼ ���۵ǰ� ���� ������ ���ϴÿ� ������ �� �� �ִ� �� �ð��� ���
 */
package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1773 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int student = Integer.parseInt(input[0]); // �����
		int time = Integer.parseInt(input[1]);  //������ ������ �ð�
		
		int firecracker[] = new int[time+1]; //�ð��� ���� ����
		
		int delay[] = new int[student];
		for( int i=0; i< student; i++) {
			delay[i] = Integer.parseInt(br.readLine());
		}
			
		int count = 0;
		for(int i=1; i<firecracker.length; i++) {
			for(int j=0; j<delay.length; j++) {
				if(i % delay[j] == 0 && firecracker[i] == 0 ) { //���� �ֱ� Ȯ�� & �ٸ� ���׵� ������ ������� Ȯ��
					firecracker[i]++;
					count++;  //���� ����
				}
			}
		}
		
		System.out.println(count);

	}

}
