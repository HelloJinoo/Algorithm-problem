/* Baekjoon 2997
 * 네 번째 수
 * 등차수열을 이루는 정수 4개중 3개가 주어졌을때 네 번째 수 구하기 ( 이 숫자는 크기 순이 아닐 수도 있음 )
 */

package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2997 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		Arrays.sort(input); //크기순이 아닐 수도 있으므로, 정렬
		int d1 = Integer.parseInt(input[1])-Integer.parseInt(input[0]); //등차
		int d2 = Integer.parseInt(input[2])-Integer.parseInt(input[1]); //등차
		
		if( d1 == d2 ) { //공차가 같은 경우 
			System.out.print(Integer.parseInt(input[2]) + d1);
		}
		else if( d1 > d2 ) {  //인접한 쌍의 차이가 다른 경우 (주어진 첫번째수와 두번째수 사이에 4번째 수가 있음) 
			System.out.println(Integer.parseInt(input[1])-d2);
		}
		else {	  //인접한 쌍의 차이가 다른 경우 (주어진 두번째수와 세번째수 사이에 4번째 수가 있음) 
			System.out.println(Integer.parseInt(input[2])-d1);
		}
		

	}

}
