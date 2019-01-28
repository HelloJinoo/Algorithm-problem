/* SwExpertAcademy 5431
 * 과제 체크하기
 * 과제를 제출한 사람에 대한 입력을 받고 안낸사람을 오름차순으로 출력
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5431 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());
		
		for(int test=1; test<=test_case;  test++) {
			String info[] = br.readLine().split(" ");
			int n = Integer.parseInt(info[0]); //수강생의 수
			int k = Integer.parseInt(info[1]); //과제를 제출한 사람 수
			boolean[] comp = new boolean[n+1];
			String complete[] = br.readLine().split(" "); //과제 제출한 사람들
			for(int i=0; i<complete.length; i++) {
				comp[Integer.parseInt(complete[i])] = true; // 과제제출 확인
			}
			
			
			System.out.print("#"+test+" ");
			for(int i=1; i<comp.length; i++) {
				if( comp[i] == false) { //과제를 제출안한 사람 
					System.out.print(i+" ");
				}
			}
			System.out.println();
			
			
		}
		

	}

}
