/* Sw Expert Academy 3499
 * 퍼펙트 셔플
 * 절반으로 나누고 나눈 것들에서 교대로 카드를 셔플
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sw_3499 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());
		
		for(int test=1; test<=test_case; test++) {
			int n = Integer.parseInt(br.readLine()); //카드의 수
			String deck[] = br.readLine().split(" ");	//카드 
			int half=0;
			if( n % 2 == 1 ) {
				half = n/2;		//홀수개 일경우
			}
			else {
				half = n/2 -1;  //짝수개 일 경우
			}
			String suffle_deck[] = new String[n];
			suffle_deck[0] = deck[0];
			
			/*퍼펙트 셔플 half를 기준으로*/
			for(int i=0 , index=0; i<=half; i++ ,index=index+2) {
				suffle_deck[index] = deck[i];
			}
			for(int i = half+1, index=1; i< suffle_deck.length; i++, index= index+2) {
				suffle_deck[index] = deck[i];
			}
			
			/*출력문*/
			System.out.print("#"+test+" ");
			for(int i=0; i<suffle_deck.length; i++) {
				System.out.print(suffle_deck[i]+" ");
			}
			System.out.println();
			
		}
		

	}

}
