/* SwExpertAcademy 2072
 * Ȧ���� ���ϱ�
 * 10���� ���� �Է� �޾�, �� �߿��� Ȧ���� ���� ���� ���
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2072 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=test; i++) {
			String input[] = br.readLine().split(" ");
			int sum =0;
			for(int index=0; index<input.length; index++) {
				int number = Integer.parseInt(input[index]);
				if(number % 2 == 1) {  //Ȧ�� �� ���
					sum += number;
				}
			}
			System.out.println("#"+i +" " + sum);
		}

	}

}
