/* Sw Expert Academy 3233
 * 정삼각형 분할 놀이
 * A를 B로 나눌때 필요한 B의 개수
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sw_3233 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());
		
		for(int test=1; test<=test_case; test++) {
			String input[] =br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			
			System.out.println("#"+test+" " + (long)(Math.pow(a, 2)/Math.pow(b, 2)));
		}

	}

}
