package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4504 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int input = Integer.parseInt(br.readLine());
		while( input != 0 ) {
			if( input % N ==0) {
				System.out.println(input + " is a multiple of " + N +".");
			}
			else {
				System.out.println(input + " is a NOT multiple of " + N +".");
			}
			input = Integer.parseInt(br.readLine());
		}

	}

}
