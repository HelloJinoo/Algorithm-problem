package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5565 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());
		
		int book = total;
		
		for(int i=0; i<9; i++) {
			book -= Integer.parseInt(br.readLine());
		}
		
		System.out.println(book);
	}

}
