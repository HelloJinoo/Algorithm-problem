package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9498 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		if( T <= 100 && T >= 0) {
			if( T <= 100 && T >= 90) {
				System.out.println("A");
			}
			else if( T <=89 && T >=80 ) {
				System.out.println("B");
			}
			else if( T <=79 && T >= 70) {
				System.out.println("C");
			}
			else if( T<= 69 && T >=60) {
				System.out.println("D");
			}
			else {
				System.out.println("F");
			}
		}
		
	}

}
