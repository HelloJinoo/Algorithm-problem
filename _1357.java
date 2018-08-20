package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1357 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int X = Integer.parseInt(input[0]);
		int Y = Integer.parseInt(input[1]);
		
		System.out.println(Rev(Rev(X)+Rev(Y)));

	}
	
	public static int Rev(int a) {
		String result = "";
		while( a > 0) {
			result += a % 10;
			a = a/10;
		}
		return Integer.parseInt(result);
		
	}

}
