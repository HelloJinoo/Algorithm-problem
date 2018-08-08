package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1009 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int test=0; test<T; test++) {
			int ab = 1;
			String line[] = br.readLine().split(" ");
			int store[] = new int[4];
		
			if( Integer.parseInt(line[1]) > 4) {
				for(int i=0; i <4; i++) {
					ab = ab*Integer.parseInt(line[0]) % 10;
					store[i] = ab;
				}
			if(ab==0) {
				System.out.println(10);
			}
			else {
				if(Integer.parseInt(line[1]) % 4 == 0 ) {
					System.out.println(store[3]);
				}
				else {
					System.out.println(store[Integer.parseInt(line[1])%4-1]);
				}
				}
			}
			else {
				for(int i=0; i <Integer.parseInt(line[1]); i++) {
					ab = ab*Integer.parseInt(line[0]) % 10;
				}
				if(ab == 0) {
					System.out.println(10);
					}
					else {
						System.out.println(ab);
					}
					
			}
			
			
		
		}
		
	}

}
