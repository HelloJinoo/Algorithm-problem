package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1110 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int N = Integer.parseInt(br.readLine());
	    br.close();
	    int comp = N;
	    int count=0;
	    
		while(true) {
			if(comp< 10 ) {
				comp = comp*11;
				count++;
			}
			else {
				int tens =  comp/ 10;
				int unit1 = comp % 10;
				int unit2 = ( tens + unit1 ) % 10;
				tens = unit1;
				comp = tens*10 + unit2;
				count++;
			}
			
			if( N == comp ) {
				System.out.println(count);
				break;
			}
			
		}
	}

}
