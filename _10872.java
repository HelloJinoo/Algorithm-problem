package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10872 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int result=1;
		
		if( N == 0 || N ==1) {
			System.out.print(1);
		}
		else {
			for(int i=1; i<=N; i++) {
				result = result * i;
			}
			System.out.println(result);
		}
	}

}
