/* SwExpertAcademy 5789
 * ������ ���� �ٲٱ�
 * �־��� ������� ������ ��ȣ�� �ٲٱ�
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class _5789 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());

		
		for(int test=1; test<=test_case; test++) {
			String input[] = br.readLine().split(" ");
			int n = Integer.parseInt(input[0]); //������ ����
			int q = Integer.parseInt(input[1]); //��� ���� Ƚ��
			int box[] = new int[n+1];
			/*�־��� ��� �ݺ� ����*/
			for(int i=1; i<=q; i++) {
				input = br.readLine().split(" ");
				int min_range = Integer.parseInt(input[0]);
				int max_range = Integer.parseInt(input[1]);
				
				for(int index = min_range; index<=max_range; index++) {
					box[index] = i;									//i�� �־��� ���ڹ�ȣ �ٲٱ�
				}
			}
			
			/*��� �� ���*/
			System.out.print("#"+test+" ");
			for(int i=1; i<box.length;i ++) {
				System.out.print(box[i]+" ");
			}
			System.out.println();
		}
	}

}
