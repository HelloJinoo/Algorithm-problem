/* Sw Expert Academy 4789
 * �������� ���� ��ȹ
 * ���ǿ� �����Ͽ� ��� ������ �⸳ �ڼ��� �ϰ� �Ϸ��� �ּ� �� ���� ����� ����ؾ� �ϴ��� ���
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4789 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());
		
		for(int test=1; test<=test_case; test++) {
			String input = "x"+br.readLine();
			int hire_empolyee= 0;  //����� �ο�
			int current_clap = input.charAt(1)-48; //���� �ڼ� �ο�
			for(int i=2; i<input.length(); i++) {
				if( current_clap >= i-1) {    //�ڼ��ο� �̵��� ���� Ȯ��( �ʿ��� �ο��� �����ϴ� ���)
					current_clap += input.charAt(i)-48;
				}
				else {						//���� ���ϴ� ���
					hire_empolyee += (i-1-current_clap);	//������ �ο� ���
					current_clap += (i-1-current_clap);		//��� �ο� ���� , ���� �ڼ� ġ���ִ� �ο� 
					current_clap +=( input.charAt(i)-48 );	//���� �������� �ڼ� �ο� �߰�
				
				}
				
			}
			System.out.println("#"+test+" "+hire_empolyee);
			
			
		}
		

	}

}
