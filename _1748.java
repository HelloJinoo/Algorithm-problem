package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1748 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		long result =0;
		long digit[] = new long[N.length()-1];
		
		for(int i=0; i<digit.length; i++) {
			digit[i] = (long) ((9*Math.pow(10, i))*(i+1));
			result += digit[i];
		}
		
		result += (Long.parseLong(N)-(Math.pow(10, digit.length))+1)*N.length();
		
		
		System.out.println(result);
	}

}
