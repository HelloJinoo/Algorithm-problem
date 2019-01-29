/* SwExpertAcademy 5515	
 * 2016년 요일 맞추기
 * 2016년의 월 ,일을 입력하여 해당 요일 출력
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5515 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());
		int days[] = {31,29,31,30,31,30,31,31,30,31,30,31}; //2016년도의 각 달마다 일수
		int day_of_week[] = {0,1,2,3,4,5,6}; //월 화 수 목 금 토 일
	
		for(int test=1; test<=test_case; test++) {
			String input[] = br.readLine().split(" ");
			int month = Integer.parseInt(input[0]); //월
			int day = Integer.parseInt(input[1]);  //일
			int day_sum = 4; //1월1일 = 금요일
			
			/*총 일수 구하기*/
			for(int i=0; i<month-1; i++) {
				day_sum += days[i];  
			}
			day_sum += (day-1);
			
			System.out.println("#"+test+" "+ day_of_week[day_sum % 7]);
		}

	}

}
