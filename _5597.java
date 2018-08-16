package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5597 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean submission[] = new boolean[31];
		
		for(int i=0; i<28; i++) {
			int student = Integer.parseInt(br.readLine());
			
			submission[student] = true;
		}
		
		for(int i=1; i<submission.length; i++) {
			if( submission[i] == false) {
				System.out.println(i);
			}
		}
	}

}
