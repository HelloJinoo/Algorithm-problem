/* Baekjoon 10539
 * 수빈이와 수열
 * index까지의 평균 -> 원래 수열 구하기
 */
package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10539 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String number[] = br.readLine().split(" ");
		int sum =0;
		System.out.print(number[0] + " ");
		for(int div=1; div<number.length; div++) {
			int pre_total = Integer.parseInt(number[div-1])* div;
			System.out.print(Integer.parseInt(number[div])*(div+1) - pre_total+" ");
		}
		
	}

}
