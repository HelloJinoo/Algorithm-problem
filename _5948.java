/* SwExpertAcademy 5948	
 * �������� 7-3-5 ����
 * 7���� ���� �� 3���� ��� 5��°�� ū �� ã��
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _5948 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int test_case = Integer.parseInt(br.readLine());
	
	for(int test=1; test<=test_case; test++) {
		String input[] = br.readLine().split(" ");
		int number[] = new int[35]; //��� 3���� ���� ���� �迭
		int index=0;
		
		/*7���� ������ 3���� ��� ����� �ִ� ��� ��*/
		for(int c=0; c<input.length-2; c++) {
			for(int next= c+1; next < input.length-1; next++) {
				for(int last=next+1; last<input.length; last++) {
					number[index] = Integer.parseInt(input[c]) + Integer.parseInt(input[next]) + Integer.parseInt(input[last]);
					index++;
				}
			}
		}
		Arrays.sort(number);	//��������
		
		int count=1;
		int comp = number[number.length-1];
		
		/*5��°�� ū �� ã��*/
		for(int i=number.length-2; i>=0; i--) {
			if(comp != number[i]) {
				comp = number[i];
				count++;
			}
			
			if(count == 5) {
				System.out.println("#"+test+" "+number[i]);
				break;
			}
		}
		
	}
	}

}
