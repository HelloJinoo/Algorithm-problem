/* Sw Expert Academy 5603
 * ���ʴ���
 * �ٲ� ���ʴ��̵��� �־����� ��, ���ʸ� ���� ����� ���� �ּ� ������ ���
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sw_5603 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());
		
		for(int test=1; test<=test_case; test++) {
			int n = Integer.parseInt(br.readLine());
			int count[] = new int[n];
			int total=0;
			/*�ٲ� ���ʴ��� �Է� , ��ü ���ʴ��� �����ϱ�*/
			for(int i=0; i<n; i++ ) {
				count[i] = Integer.parseInt(br.readLine());
				total += count[i];
			}
			int avr_count = total/n;
			int move= 0;
			/*�̵��ϴ� Ƚ��*/
			for(int i=0; i<count.length; i++) {
				if( count[i] > avr_count) {
					move += (count[i] - avr_count);
				}
			}
			System.out.println("#"+test+" "+move); //���
			
		}
	}

}
