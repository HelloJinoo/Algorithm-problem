/* Sw Expert Academy 3143
 * ���� ���� ���ڿ� Ÿ����
 * ��ü���ڿ��� Ÿ���� �ϱ� ���� Ű�� ������ �ϴ� Ƚ���� �ּڰ� , �ϳ��� Ű���� ����
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3143 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());
		
		for(int test=1; test<=test_case; test++) {
			String input[] = br.readLine().split(" ");
			String text = input[0];	//�Է¹���
			String one_text = input[1];  //�ϳ��� Ű����
			
			String sp[] = text.split(one_text);
			
			int text_s = 0;
			for(int i=0; i<sp.length; i++) {
				text_s += sp[i].length();	//�ϳ��� �������ϴ� ���ڵ�
			}
			
			int extra_s = text.length() - text_s; 
			int count = text_s;	
			count += extra_s/one_text.length();	//Ű���� �Է� Ƚ�� 
			
			System.out.println("#"+test+" "+ count);
			
		}
			
		
	}
}
