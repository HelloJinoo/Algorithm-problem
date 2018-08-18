package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _5618 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int number[] = new int[N];
		
		String input[] =br.readLine().split(" ");
		
		for(int i=0; i<input.length; i++) {
			number[i] = Integer.parseInt(input[i]);
		}
		
		Arrays.sort(number);
		
		for(int i=1; i<=number[0]; i++) {
			if(number.length ==2 ) {
				if( number[0] % i ==0 && number[1 ] % i ==0) {
					System.out.println(i);
				}
			}
			else if(number.length ==3 ) {
				if(  number[0] % i ==0 && number[1 ] % i ==0 && number[2] % i ==0) {
					System.out.println(i);
				}
			}
			
		}
		
	}

}
