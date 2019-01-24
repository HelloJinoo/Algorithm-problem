/* SwExpertAcademy 2072
 * 홀수만 더하기
 * 10개의 수를 입력 받아, 그 중에서 홀수만 더한 값을 출력
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2072 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=test; i++) {
			String input[] = br.readLine().split(" ");
			int sum =0;
			for(int index=0; index<input.length; index++) {
				int number = Integer.parseInt(input[index]);
				if(number % 2 == 1) {  //홀수 인 경우
					sum += number;
				}
			}
			System.out.println("#"+i +" " + sum);
		}

	}

}
