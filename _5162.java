/* SwExpertAcademy 5162
 * �ΰ��� ���� ������
 * �ִ� ��� �ִ� ���� ���� ���
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5162 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());
		
		for(int test=1; test<=test_case; test++) {
			String input[] = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]); //���̻� ����
			int b = Integer.parseInt(input[1]); //��ȣ�ڻ� ����
			int c = Integer.parseInt(input[2]); //������ �ִ� ��
			
			int buy_a = c/a; //���̻� ��� �ִ� ����
			int buy_b = c/b; //��ȣ�ڻ� ��� �ִ� ����
			
			int total_buy= 0; //����ִ� �ִ� ���� ����
			if( buy_a < buy_b) {
				total_buy = buy_b;
				c = c - buy_b * b;
				if( c/a > 0) {   //�������� ������ ���̻��� ��� �ִ� �� Ȯ��
					total_buy += c/a;
				}
			}
			else {
				total_buy = buy_a;
				c = c - buy_a * a;
				if( c/b > 0) {	//������ ������ ��ȣ�ڻ��� ��� �ִ� �� Ȯ��
					total_buy += c/b;
				}
				
			}
			System.out.println("#"+test+" "+total_buy);
		}

	}

}
