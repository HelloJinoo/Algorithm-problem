package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10039 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum=0;
		int score[] = new int[5];
		
		for(int i=0; i<5; i++) {
			 score[i] = Integer.parseInt(br.readLine());
			 if(score[i] < 40) {
				 score[i] = 40;
			 }
			 sum += score[i];
		}
		
		int average = sum / 5;
		System.out.println(average);
	}

}
