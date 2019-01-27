/* SwExpertAcademy 6692
 * �ټ����� ���� ����
 * ���ڿ� Ȯ���� ����ִ� ������ ���
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class _6692 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());
		DecimalFormat df = new DecimalFormat("#.######"); //���� ����
	
		for(int test=1; test<=test_case; test++) {
			BigDecimal sum = new BigDecimal("0");
			int n = Integer.parseInt(br.readLine());
			for(int i=0; i<n; i++) {
				String input[] = br.readLine().split(" ");
				BigDecimal number1 = new BigDecimal(input[0]); //�Է��� Ȯ��
		        BigDecimal number2 = new BigDecimal(input[1]); //����
		        BigDecimal result = number1.multiply(number2); //��� ����
		        sum = sum.add(result);
			}
			String str = String.format("%.6f", sum);	//�Ҽ��� 6�ڸ����� ���
			System.out.println("#"+test+" " +str);
		}
	}
}
