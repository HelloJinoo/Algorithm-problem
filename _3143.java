/* Sw Expert Academy 3143
 * 가장 빠른 문자열 타이핑
 * 전체문자열을 타이핑 하기 위해 키를 눌러야 하는 횟수의 최솟값 , 하나의 키워드 존재
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3143 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());
		
		for(int test=1; test<=test_case; test++) {
			String input[] = br.readLine().split(" ");
			String text = input[0];	//입력문자
			String one_text = input[1];  //하나의 키워드
			
			String sp[] = text.split(one_text);
			
			int text_s = 0;
			for(int i=0; i<sp.length; i++) {
				text_s += sp[i].length();	//하나씩 눌러야하는 글자들
			}
			
			int extra_s = text.length() - text_s; 
			int count = text_s;	
			count += extra_s/one_text.length();	//키워드 입력 횟수 
			
			System.out.println("#"+test+" "+ count);
			
		}
			
		
	}
}
