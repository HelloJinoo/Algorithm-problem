package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1476 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int E = Integer.parseInt(input[0]);
		int S = Integer.parseInt(input[1]);
		int M = Integer.parseInt(input[2]);
		int i=0;
		while( !((i % 15+1) == E && (i % 28) +1 ==S && (i %19)+1 ==M ) ) {		
			i++;
		}
		System.out.println(i+1);

	}

}
