package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2153 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		int score=0;
		
		for(int i=0; i< word.length(); i++) {
			if(word.charAt(i) > 96) {
				score += word.charAt(i)-96;
			}
			else if( word.charAt(i) > 64 ) {
				score += word.charAt(i) -38;
			}
		}
		
		int count=0;
		if( score ==1 ) {
			System.out.println("It is a prime word.");
		}
		else {
			for(int i=1; i<=score; i++) {
				if(score % i ==0 ) {
					count++;
					if( count>2) {
						break;
					}
				}
			}
			if( count ==2 ) {
				System.out.println("It is a prime word.");
			}
			else {
				System.out.println("It is not a prime word.");
			}
		}
	}

}
