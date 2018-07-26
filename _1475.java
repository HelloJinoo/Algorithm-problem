package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1475 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		int count[] = new int[9];
		int set =0;
		
		if( N == 0) {
			set = 1;
		}
		else {
		while( N != 0) {
			int num = N % 10;
			if( num == 0 ) {
				count[0]++;
			}
			else if( num == 1) {
				count[1]++;
			}
			else if( num == 2 ) {
				count[2]++;
			}
			else if( num == 3 ) {
				count[3]++;
			}
			else if( num == 4 ) {
				count[4]++;
			}
			else if( num == 5 ) {
				count[5]++;
			}
			else if( num == 6 || num ==9) {
				count[6]++;
			}
			else if( num == 7 ) {
				count[7]++;
			}
			else if( num == 8 ) {
				count[8]++;
			}
			N = N/10;
			}
		}
		for(int i=0; i<count.length; i++) {
			if( i == 6 ) {
				if( count[i] % 2 == 0) {
					if( set <  ( count[i] / 2 )) {
						set = count[i] /2;
						
					}
				}
				else if( count[i] % 2 ==1) {
					if( set < ( (count[i]+1 ) / 2) ){
						set = (count[i] +1) /2;
				
					}
				}
			}
			else if( set <= count[i] ) {
				set = count[i];
			}
		}
		
		System.out.println(set);
	}

}
