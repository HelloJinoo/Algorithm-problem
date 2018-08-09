package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10798 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line[] = new String[5];
		
		for(int test=0; test<5; test++) {
			 line[test] = br.readLine();
		}
			for(int i=0; i<15; i++) {	
				for(int j=0; j<5; j++) {
					if( i >= line[j].length()) {
						continue;
					}
					else {
					System.out.print(line[j].charAt(i));
						}
					}
			}
		
	}

}
