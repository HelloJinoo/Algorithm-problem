package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2163 {

	public static void main(String[] args) throws NumberFormatException, IOException {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String line2[] = line.split(" ");
		int N = Integer.parseInt(line2[0]);
		int M =Integer.parseInt(line2[1]);
		System.out.println(N);
		System.out.println(M);
		System.out.println( N*M -1 );
	}

}
