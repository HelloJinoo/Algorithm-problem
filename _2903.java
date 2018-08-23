package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2903 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int result =4;
		
		for(int i=1; i<=N; i++) {
			int outside = (int) (Math.pow(2, i) -1);
			int squre = (int) Math.pow(Math.pow(2 , i-1),2);
			int inside = squre - outside;
			result += ((outside*4)+1) + inside*3;
		}
		System.out.println(result);
		
		
		
		
	}

}
