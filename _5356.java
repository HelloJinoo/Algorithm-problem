/* Sw Expert Academy 5356
 * �Ǽ����� ���η� ���ؿ�
 * 5���� ���ڿ��� ���η� �б�
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5356 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());
		
		for(int test=1; test<=test_case; test++) {
			String input[] = new String[5];
			int max = 0;
			/*5���� ���ڿ� �Է� , ���� �� ���� ã��*/
			for(int i=0; i<5; i++) {
				input[i] = br.readLine();
				if(max < input[i].length()) {
					max = input[i].length();
				}
			}
			
			/*��¹�*/
			System.out.print("#"+test+" ");
			for(int j=0; j<max; j++ ) {
				for(int i=0; i<5; i++) {
					if( j < input[i].length()) {
					System.out.print(input[i].charAt(j));
					}
				}
			}
			System.out.println();
		}
		
		

	}

}
