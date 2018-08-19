package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2914 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		
		int A = Integer.parseInt(input[0]);
		int L = Integer.parseInt(input[1]);
		
		System.out.println(A*(L-1) +1 );
	}

}
