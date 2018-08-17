package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2851 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int mushroom[] = new int[10];

		for(int i=0; i<10; i++) {
			mushroom[i] = Integer.parseInt(br.readLine());
		}
		int sum=mushroom[0];
		int prevsum=0;
		
		for(int i=1; i<mushroom.length; i++) {
			prevsum = sum;
			sum += mushroom[i];
			if(sum > 100) {
				break;
			}
		}
		
		if(100 - prevsum < sum -100 ) {
			System.out.println(prevsum);
		}
		else if( 100 - prevsum >= sum -100) {
			System.out.println(sum);
		}
		
	

	}

}
