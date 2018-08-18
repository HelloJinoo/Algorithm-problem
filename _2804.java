package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2804 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		String A = input[0];
		String B = input[1];
		
		int indexA=0;
		int indexB=0;
		int change =0;
		
		for(int i=0; i<A.length(); i++) {
			for(int j=0; j<B.length(); j++) {
				if( A.charAt(i) == B.charAt(j)) {
					change = 1;
					indexA = j;
					indexB = i;
					break;
				}
			}
			if(change ==1) {
				break;
			}
		}
		
		char result[][] = new char[B.length()][A.length()];
		
		for(int i=0; i<B.length(); i++) {
			for(int j=0; j<A.length(); j++) {
				if( j == indexB) {
					result[i][j] = B.charAt(i);
				}
				else if( i == indexA) {
					result[i][j] = A.charAt(j);
				}
				else {
					result[i][j] = '.';
				}
			}
		}
		for(int i=0; i<B.length(); i++) {
			for(int j=0; j<A.length(); j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}
}
