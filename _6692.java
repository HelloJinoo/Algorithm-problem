/* SwExpertAcademy 6692
 * 다솔이의 월급 상자
 * 상자에 확률로 담겨있는 월급의 평균
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
		DecimalFormat df = new DecimalFormat("#.######"); //포맷 설정
	
		for(int test=1; test<=test_case; test++) {
			BigDecimal sum = new BigDecimal("0");
			int n = Integer.parseInt(br.readLine());
			for(int i=0; i<n; i++) {
				String input[] = br.readLine().split(" ");
				BigDecimal number1 = new BigDecimal(input[0]); //입력한 확률
		        BigDecimal number2 = new BigDecimal(input[1]); //월급
		        BigDecimal result = number1.multiply(number2); //평균 월급
		        sum = sum.add(result);
			}
			String str = String.format("%.6f", sum);	//소수점 6자리까지 출력
			System.out.println("#"+test+" " +str);
		}
	}
}
