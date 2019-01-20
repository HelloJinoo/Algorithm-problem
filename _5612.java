/* Baekjoon 5612
 * 터널의 입구와 출구
 * 조사 시작하고 j분이 지난 시점 (j = 0~n)에서 터널 안에 있는 차량의 수의 최댓값
 */

package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5612 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int time = Integer.parseInt(br.readLine());
		int car_count = Integer.parseInt(br.readLine());
		int max_count = 0;
		
		int comp=0;
		for(int i=0; i<time; i ++) {
			String input[] = br.readLine().split(" ");
			int enter = Integer.parseInt(input[0]); //입구를 통과한 차의 수
			int exit = Integer.parseInt(input[1]); //출구를 통과한 차의 수
			
			car_count += (enter - exit);
			if( car_count < 0 ) {
				comp = -1; //음수가 발생할 경우 0으로 출력 
				break;
			}
			else {
				if(max_count < car_count) { //가장 많은 수의 차 갯수 확인
					max_count = car_count;
				}
			}
		}
		
		/*출력*/
		if( comp == -1) {
			System.out.println("0");
		}
		else {
			System.out.println(max_count);
		}
	}

}
