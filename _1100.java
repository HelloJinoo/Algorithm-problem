/* Baekjoon 1100
 * �Ͼ� ĭ
 * ü������ 8*8ũ���̰�, ���� ĭ�� �Ͼ� ĭ�� �����ư��鼭 ��ĥ�Ǿ� �ִ�.
 * ü������ ���°� �־����� ��, �Ͼ� ĭ ���� ���� �� �� �ִ��� ���
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
			if(i % 2 == 0) {             //ó��ĭ�� �Ͼ��ĭ
				count_white(chessboard , 0);
			}
			else {						//ó��ĭ�� ������ ĭ
				count_white(chessboard , 1);
			}
		}
		
		System.out.println(count);
	}
	private static void count_white(String chessboard , int color) {
		if(color == 0) { // �Ͼ��
			for(int i=0; i<chessboard.length(); i=i+2) {
				if(chessboard.charAt(i) == 'F') {
					count++;
				}
			}
		}
		else { //������
			for(int i=1; i<chessboard.length(); i=i+2) {
				if(chessboard.charAt(i) == 'F') {
					count++;
				}
			}
			
		}
		
	}

}
