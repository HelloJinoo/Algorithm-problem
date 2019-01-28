/* SwExpertAcademy 5789
 * 현주의 상자 바꾸기
 * 주어진 방법으로 상자의 번호를 바꾸기
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class _5789 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());

		
		for(int test=1; test<=test_case; test++) {
			String input[] = br.readLine().split(" ");
			int n = Integer.parseInt(input[0]); //상자의 개수
			int q = Integer.parseInt(input[1]); //방법 실행 횟수
			int box[] = new int[n+1];
			/*주어진 방법 반복 실행*/
			for(int i=1; i<=q; i++) {
				input = br.readLine().split(" ");
				int min_range = Integer.parseInt(input[0]);
				int max_range = Integer.parseInt(input[1]);
				
				for(int index = min_range; index<=max_range; index++) {
					box[index] = i;									//i로 주어진 상자번호 바꾸기
				}
			}
			
			/*결과 값 출력*/
			System.out.print("#"+test+" ");
			for(int i=1; i<box.length;i ++) {
				System.out.print(box[i]+" ");
			}
			System.out.println();
		}
	}

}
