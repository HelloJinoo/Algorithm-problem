package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10844 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long count[] = new long[10];
		long temp[] = new long[10];
		count[0] = 0;
		temp[0] = 0;
		for(int i=1; i< count.length; i++) {
			count[i] = 1;
			temp[i] = 1;
		}
		
		
		for(int i=1; i<N; i++) {
			for(int j=0; j < count.length; j++) {
				if( j == 0) {
					count[j] = temp[j+1 ]% 1000000000 ;
				}else if( j == count.length-1) {
					count[j] = temp[j-1] % 1000000000 ;
				}
				else {
					count[j] = ( temp[j-1] + temp[j+1] ) % 1000000000;
				}
			}
			System.arraycopy(count, 0, temp, 0, count.length);
		}
		long result = 0;
		for(int i=0; i<count.length; i++) {
			result += ( count[i] ); 	
		}
		System.out.println(result % 1000000000);
		
	}

}
