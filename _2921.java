package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2921 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N =Integer.parseInt(br.readLine());
		
		int count=0;
		
		for(int i=N*2; i>=0; i--) {
			count += i;
			int opp=0;
			int half =0;
			if( i % 2 ==0) {
				half = i/2;
				opp = i/2;
			}
			else {
				half = i- (i/2);
				opp = i - half;
			}
			for(int j=1; ;j++) {
				int comphalf = half+j;
				int compopp = opp-j;
				
				if( comphalf <= N && compopp>=0 ) {
					count += i;
				}
				else {
		
					break;
				}
			}
		}
		
		System.out.println(count);
		
		
	}

}
