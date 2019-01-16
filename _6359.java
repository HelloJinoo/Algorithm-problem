/* Baekjoon 6539
 * 만취한 상범
 * k번째 라운드에서는 번호가 k의 배수인 방이 열려 있으면 잠그고, 잠겨 있다면 연다.
 */
package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _6359 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int i=0; i<test; i++) {
			int room = Integer.parseInt(br.readLine());
			int count =0;
			boolean check[] = new boolean[room+1];	//1라운드 -> 모두 연다 false로 시작
			for(int round=2; round<=room; round++) {
				for(int mul=1; mul*round<=room; mul++ ) {
					if(check[round*mul] == false) {     //열려있는 상태라면
						check[round*mul] = true; // 닫음
					}
					else {
						check[round*mul] = false; //얼음
					}
				}
			}	
			for(int s=1; s<check.length; s++) {
				if( check[s] == false) {
					count++;
				}
			}
			System.out.println(count);
			
		}
	}
}
