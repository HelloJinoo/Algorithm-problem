/* Baekjoon 6539
 * ������ ���
 * k��° ���忡���� ��ȣ�� k�� ����� ���� ���� ������ ��װ�, ��� �ִٸ� ����.
 */
package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _6359 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int i=0; i<test; i++) {
			int room = Integer.parseInt(br.readLine());
			int count =0;
			boolean check[] = new boolean[room+1];	//1���� -> ��� ���� false�� ����
			for(int round=2; round<=room; round++) {
				for(int mul=1; mul*round<=room; mul++ ) {
					if(check[round*mul] == false) {     //�����ִ� ���¶��
						check[round*mul] = true; // ����
					}
					else {
						check[round*mul] = false; //����
					}
				}
			}	
			for(int s=1; s<check.length; s++) {
				if( check[s] == false) {
					count++;
				}
			}
			System.out.println(count);
			
		}
	}
}
