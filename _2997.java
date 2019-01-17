/* Baekjoon 2997
 * �� ��° ��
 * ���������� �̷�� ���� 4���� 3���� �־������� �� ��° �� ���ϱ� ( �� ���ڴ� ũ�� ���� �ƴ� ���� ���� )
 */

package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2997 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		Arrays.sort(input); //ũ����� �ƴ� ���� �����Ƿ�, ����
		int d1 = Integer.parseInt(input[1])-Integer.parseInt(input[0]); //����
		int d2 = Integer.parseInt(input[2])-Integer.parseInt(input[1]); //����
		
		if( d1 == d2 ) { //������ ���� ��� 
			System.out.print(Integer.parseInt(input[2]) + d1);
		}
		else if( d1 > d2 ) {  //������ ���� ���̰� �ٸ� ��� (�־��� ù��°���� �ι�°�� ���̿� 4��° ���� ����) 
			System.out.println(Integer.parseInt(input[1])-d2);
		}
		else {	  //������ ���� ���̰� �ٸ� ��� (�־��� �ι�°���� ����°�� ���̿� 4��° ���� ����) 
			System.out.println(Integer.parseInt(input[2])-d1);
		}
		

	}

}
