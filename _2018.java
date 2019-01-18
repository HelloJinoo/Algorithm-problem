/* Baekjoon 2018
 * 수들의 합 5
 * N을 몇 개의 연속된 자연수의 합으로 나타내는 가지수
 */

package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2018 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine()); 
		int count=1; //자기자신은 무조건 포함이기 때문
		for(int i=1; i<n; i++) {
			int sum = i;
			for(int j=i+1; i<n; j++) {
				sum += j; // 연속된 자연수의 합
				if( sum == n) { //확인하려는 n과 비교
					count++;
				}
				else if( sum > n) { //sum이 커질경우 더이상 만족하지 못하기때문에 for문을 빠져나옴
					break;
				}
			}
		}
		System.out.println(count);

	}

}
