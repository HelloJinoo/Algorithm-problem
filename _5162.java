/* SwExpertAcademy 5162
 * 두가지 빵의 딜레마
 * 최대 살수 있는 방의 개수 출력
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5162 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());
		
		for(int test=1; test<=test_case; test++) {
			String input[] = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]); //현미빵 가격
			int b = Integer.parseInt(input[1]); //단호박빵 가격
			int c = Integer.parseInt(input[2]); //가지고 있는 돈
			
			int buy_a = c/a; //현미빵 살수 있는 개수
			int buy_b = c/b; //단호박빵 살수 있는 개수
			
			int total_buy= 0; //살수있는 최대 빵의 개수
			if( buy_a < buy_b) {
				total_buy = buy_b;
				c = c - buy_b * b;
				if( c/a > 0) {   //나머지도 돈으로 현미빵을 살수 있는 지 확인
					total_buy += c/a;
				}
			}
			else {
				total_buy = buy_a;
				c = c - buy_a * a;
				if( c/b > 0) {	//나머지 돈으로 단호박빵을 살수 있는 지 확인
					total_buy += c/b;
				}
				
			}
			System.out.println("#"+test+" "+total_buy);
		}

	}

}
