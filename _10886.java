package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10886 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int count1=0;
		int count0=0;
		
		for(int test=0; test <T; test++) {
			int answer = Integer.parseInt(br.readLine());
			
			if(answer == 1) {
				count1++;
			}
			else {
				count0++;
			}
		}
		
		if( count1 > count0) {
			System.out.println("Junhee is cute!");
		}
		else {
			System.out.println("Junhee is not cute!");
		}
	}

}
