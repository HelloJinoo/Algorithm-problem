/* Baekjoon 1100
 * 하얀 칸
 * 체스판은 8*8크기이고, 검정 칸과 하얀 칸이 번갈아가면서 색칠되어 있다.
 * 체스판의 상태가 주어졌을 때, 하얀 칸 위에 말이 몇 개 있는지 출력
 */
package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1100 {

	static int count =0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<8; i++) {
			String chessboard = br.readLine();
			if(i % 2 == 0) {             //처음칸이 하얀색칸
				count_white(chessboard , 0);
			}
			else {						//처음칸이 검은색 칸
				count_white(chessboard , 1);
			}
		}
		
		System.out.println(count);
	}
	private static void count_white(String chessboard , int color) {
		if(color == 0) { // 하얀색
			for(int i=0; i<chessboard.length(); i=i+2) {
				if(chessboard.charAt(i) == 'F') {
					count++;
				}
			}
		}
		else { //검은색
			for(int i=1; i<chessboard.length(); i=i+2) {
				if(chessboard.charAt(i) == 'F') {
					count++;
				}
			}
			
		}
		
	}

}
