/* Baekjoon 2631
 * �ټ����
 * ��ȣ ������� ���� ����� ���ؼ� ���̵��� ��ġ�� �ű���� �Ѵ�. 
 * �׸��� ���̵��� ȥ������������ �ʵ��� �ϱ� ���� ��ġ�� �ű�� ���̵��� ���� �ּ�
 */
package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2631 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int child_count = Integer.parseInt(br.readLine()); //������ ��
		int[] posi = new int[child_count];
		int[] greater = new int[child_count];  //�ڽź��� ���� �����ϴ� ���� ��ִ��� �����ϴ� �迭
		
		for(int i=0; i<posi.length; i++) {
			posi[i] = Integer.parseInt(br.readLine()); //�̵��ϱ��� ���̵��� ��ġ
			greater[i] = 1;	//greater�迭 �ʱ�ȭ
		}
		int max = 0;
		for(int i=1; i<posi.length; i++) {
			for(int j=i-1; j>=0; j--) {
				if(posi[j] < posi[i] && greater[i] < greater[j]+1) {  //�ڽź��� ���� �� ������ ���� Ȯ��
					greater[i] = greater[j]+1;
				}
				if( greater[i] > max ) {
					max = greater[i];
				}
			}
		}
		System.out.println(posi.length-max);
	}
}
