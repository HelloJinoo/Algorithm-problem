package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5585 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count=0;
		
		int Changes = 1000 -N;
		
		
			if( Changes / 500 !=0 ) {
				count = count + ( Changes / 500 );
				Changes = Changes % 500;
			}
			 if( Changes / 100 !=0 ) {
				count = count + ( Changes / 100 );
				Changes = Changes % 100;
			}
			 if( Changes / 50 !=0 ) {
				count = count + ( Changes / 50 );
				Changes = Changes % 50;
			}
			 if( Changes / 10 !=0 ) {
					count = count + ( Changes / 10 );
					Changes = Changes % 10;
				}
			 if( Changes / 5 !=0 ) {
					count = count + ( Changes / 5 );
					Changes = Changes % 5;
				}
			 if( Changes / 1 !=0 ) {
					count = count + ( Changes / 1 );
					Changes = Changes % 1;
				}
		
		
		System.out.println(count);
	}

}
