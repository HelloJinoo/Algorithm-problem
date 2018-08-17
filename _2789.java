package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2789 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line[] = br.readLine().split(" ");
		
		int N = Integer.parseInt(line[0]);
		int M = Integer.parseInt(line[1]);
		
		int score[] = new int[N];
		String input[] = br.readLine().split(" ");
		for(int i=0; i<N; i++) {
			score[i] = Integer.parseInt(input[i]);
		}
		int min = M;
		int totalsum = 0;
		for(int i=0; i<score.length-2; i++) {
			for(int j=i+1; j<score.length-1; j++) {
				for(int k=j+1; k<score.length; k++) {
					int sum = score[i] + score[j] + score[k];
					if( M-sum >=0 && M-sum < min) {
						min = M-sum;
						totalsum = sum;
					}
				}
			}
		}
			System.out.println(totalsum);
	}

}
