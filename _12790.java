package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _12790 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int test=0; test<T; test++) {
			String input[] = br.readLine().split(" ");
			int basicHp = Integer.parseInt(input[0]);
			int basicMp = Integer.parseInt(input[1]);
			int basicAd = Integer.parseInt(input[2]);
			int basicDf = Integer.parseInt(input[3]);
			
			int plusHp = Integer.parseInt(input[4]);
			int plusMp = Integer.parseInt(input[5]);
			int plusAd = Integer.parseInt(input[6]);
			int plusDf = Integer.parseInt(input[7]);
			
			int sumHp = basicHp+plusHp;
			int sumMp = basicMp+plusMp;
			int sumAd = basicAd+plusAd;
			int sumDf = basicDf+plusDf;
			
			if( sumHp < 1 ) {
				sumHp = 1;
			}
			if( sumMp <1) {
				sumMp=1;
			}
			if( sumAd <0) {
				sumAd = 0;
			}
			
			System.out.println(sumHp + 5*(sumMp) + 2*(sumAd) + 2*(sumDf));
			
		}

	}

}
