/* Baekjoon 2018
 * ������ �� 5
 * N�� �� ���� ���ӵ� �ڿ����� ������ ��Ÿ���� ������
 */

package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2018 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine()); 
		int count=1; //�ڱ��ڽ��� ������ �����̱� ����
		for(int i=1; i<n; i++) {
			int sum = i;
			for(int j=i+1; i<n; j++) {
				sum += j; // ���ӵ� �ڿ����� ��
				if( sum == n) { //Ȯ���Ϸ��� n�� ��
					count++;
				}
				else if( sum > n) { //sum�� Ŀ����� ���̻� �������� ���ϱ⶧���� for���� ��������
					break;
				}
			}
		}
		System.out.println(count);

	}

}
