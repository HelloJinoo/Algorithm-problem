/* SwExpertAcademy 5515	
 * 2016�� ���� ���߱�
 * 2016���� �� ,���� �Է��Ͽ� �ش� ���� ���
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5515 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());
		int days[] = {31,29,31,30,31,30,31,31,30,31,30,31}; //2016�⵵�� �� �޸��� �ϼ�
		int day_of_week[] = {0,1,2,3,4,5,6}; //�� ȭ �� �� �� �� ��
	
		for(int test=1; test<=test_case; test++) {
			String input[] = br.readLine().split(" ");
			int month = Integer.parseInt(input[0]); //��
			int day = Integer.parseInt(input[1]);  //��
			int day_sum = 4; //1��1�� = �ݿ���
			
			/*�� �ϼ� ���ϱ�*/
			for(int i=0; i<month-1; i++) {
				day_sum += days[i];  
			}
			day_sum += (day-1);
			
			System.out.println("#"+test+" "+ day_of_week[day_sum % 7]);
		}

	}

}
