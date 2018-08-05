package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _4948 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
				while(n != 0 ) {
					int count=0;
					int number=0;
					for(int i=n+1; i<=2*n; i++) {
					
						for(int j=2; j<((int)Math.sqrt(i))+1; j++) {
							if( i % j == 0 ) {
								number++;
								if(number > 0) {
									break;
								}
							}
						}
						if( number == 0) {
							count++;
						}
						number=0;
					
					}
					System.out.println(count);
					n = Integer.parseInt(br.readLine());
				}
				
				
		}
}
