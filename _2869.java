package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2869 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] =br.readLine().split(" ");
		int morningA = Integer.parseInt(input[0]);
		int nightB = Integer.parseInt(input[1]);
		int destination = Integer.parseInt(input[2]);
		int currentposition = 0;
		int day = 0;
		
		while( currentposition < destination ) {
			currentposition +=morningA;
			day++;
			if( currentposition < destination ) {
				currentposition -= nightB;
				
			}
		}

		System.out.println(day);
	}

}
