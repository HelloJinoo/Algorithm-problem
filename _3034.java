package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3034 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int N =Integer.parseInt(input[0]);
		int W = Integer.parseInt(input[1]);
		int H = Integer.parseInt(input[2]);
		
		int max = (int) Math.sqrt(Math.pow(W, 2)+Math.pow(H,2));
		
		for(int i=0; i<N; i++) {
			int matches = Integer.parseInt(br.readLine());
			if(matches <= max) {
				System.out.println("DA");
			}
			else {
				System.out.println("NE");
			}
		}
	}

}
