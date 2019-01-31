/* Sw Expert Academy 4789
 * 성공적인 공연 기획
 * 조건에 만족하여 모든 관객이 기립 박수를 하게 하려면 최소 몇 명의 사람을 고용해야 하는지 출력
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4789 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());
		
		for(int test=1; test<=test_case; test++) {
			String input = "x"+br.readLine();
			int hire_empolyee= 0;  //고용한 인원
			int current_clap = input.charAt(1)-48; //현재 박수 인원
			for(int i=2; i<input.length(); i++) {
				if( current_clap >= i-1) {    //박수인원 미도달 여부 확인( 필요한 인원에 만족하는 경우)
					current_clap += input.charAt(i)-48;
				}
				else {						//만족 못하는 경우
					hire_empolyee += (i-1-current_clap);	//부족한 인원 고용
					current_clap += (i-1-current_clap);		//고용 인원 포함 , 현재 박수 치고있는 인원 
					current_clap +=( input.charAt(i)-48 );	//조건 만족으로 박수 인원 추가
				
				}
				
			}
			System.out.println("#"+test+" "+hire_empolyee);
			
			
		}
		

	}

}
