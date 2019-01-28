/* SwExpertAcademy 5431
 * ���� üũ�ϱ�
 * ������ ������ ����� ���� �Է��� �ް� �ȳ������ ������������ ���
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5431 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());
		
		for(int test=1; test<=test_case;  test++) {
			String info[] = br.readLine().split(" ");
			int n = Integer.parseInt(info[0]); //�������� ��
			int k = Integer.parseInt(info[1]); //������ ������ ��� ��
			boolean[] comp = new boolean[n+1];
			String complete[] = br.readLine().split(" "); //���� ������ �����
			for(int i=0; i<complete.length; i++) {
				comp[Integer.parseInt(complete[i])] = true; // �������� Ȯ��
			}
			
			
			System.out.print("#"+test+" ");
			for(int i=1; i<comp.length; i++) {
				if( comp[i] == false) { //������ ������� ��� 
					System.out.print(i+" ");
				}
			}
			System.out.println();
			
			
		}
		

	}

}
