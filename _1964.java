package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1964 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int first = 5;
		if(N ==1 ) {
			System.out.println(5);
		}
		else {
			long number =  12;
			long prev = number;
			long plus = 7;
			for(int i=3; i<=N; i++) {
				number = prev + plus+3;
				plus = plus+3;
				prev = number;
			}
			
			System.out.println(number % 45678);
		}

	}

}
