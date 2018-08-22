package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1834 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long result = 0;
		for(int i=1; i<N; i++) {
			result += (long) N*i + i ;
		}
		System.out.println(result);
		

	}

}
