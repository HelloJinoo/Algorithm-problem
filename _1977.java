package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1977 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		int sum =0;
		int min = 0;
		for( int i=1; i<=100; i++) {
			if( i * i <= N && i * i >= M) {
				sum += i * i;
				if(min == 0) {
					min = i* i;
				}
			}
		}
		if( sum > 0 ) {	
			System.out.println(sum);
			System.out.println(min);
		}
		else {
			System.out.println("-1");
		}	
	}

}
