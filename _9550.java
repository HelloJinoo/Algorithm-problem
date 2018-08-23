package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9550 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		
		for(int i=0; i<T; i++) {
			int invite=0;
			String input[] =br.readLine().split(" ");
			String input2[] = br.readLine().split(" ");
			
			int N =Integer.parseInt(input[0]);
			int k = Integer.parseInt(input[1]);
			
			for(int j=0; j<input2.length; j++) {
				 invite += ( Integer.parseInt(input2[j]) / k);
			}
			System.out.println(invite);
		}

	}

}
