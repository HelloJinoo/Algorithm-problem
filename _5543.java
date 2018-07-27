package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5543 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		
		for(int i=0; i<3; i++) {
			int N = Integer.parseInt(br.readLine());
			if( min1 > N) {
				min1 = N;
			}
		}
		for(int i=0; i<2; i++) {
			int N = Integer.parseInt(br.readLine());
			if( min2 > N) {
				min2 = N;
			}
		}
		
		System.out.println(min1 + min2 - 50);
	}

}
