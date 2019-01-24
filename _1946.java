/* Sw Expert Academy 1946
 * 간단한 압축 풀기
 * 너비가 10인 여러 줄의 문자열 출력
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1946 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());

		for(int i=1; i<=test; i++) {
			int t_case = Integer.parseInt(br.readLine());
			String result="";
			for(int t=0; t<t_case; t++) {
				String input[] = br.readLine().split(" ");
				String text = input[0];
				int count = Integer.parseInt(input[1]);
				for( int index=0; index<count; index++) {
					result += text;  //입력된 글자의 개수만큼 String 값에 더해줌.
				}
				
			}
			
			/*print start,  testcase number*/
			System.out.println("#"+i);
			System.out.print(result.charAt(0));
			/* 10개씩 print*/
			for(int p=1; p<result.length(); p++) {
				if(p % 10 == 0) {
					System.out.println();
					System.out.print(result.charAt(p));
				}
				else {
					System.out.print(result.charAt(p));
				}
			}
			System.out.println();
			result ="";
	
		}
	}
	
}
