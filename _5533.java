package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5533 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int player = Integer.parseInt(br.readLine());

		int score[][] = new int[player][3];
		
		for(int i=0; i<player; i++) {
			String line[] = br.readLine().split(" ");
			score[i][0] = Integer.parseInt(line[0]);
			score[i][1] = Integer.parseInt(line[1]);
			score[i][2] = Integer.parseInt(line[2]);
		}
		boolean eq[][] = new boolean[player][3];
		int sumscore[] = new int[player]; 
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<player; j++) {
				if( i == j) {
					continue;
				}
				else {
					if( score[i][0] == score[j][0]) {
							eq[i][0] = true;
					}
					if( score[i][1] == score[j][1]) {
							eq[i][1] = true;
					}
					if( score[i][2] == score[j][2]) {
							eq[i][2] = true;
					}
				}
			}
		}
		
		for(int i=0; i<player; i++) {
			for(int j=0; j<3; j++) {
				if( eq[i][j] == false ) {
					sumscore[i] += score[i][j];
				}
			}
		}
		
		for(int i=0; i<sumscore.length; i++) {
			System.out.println(sumscore[i]);
		}
	}

}
