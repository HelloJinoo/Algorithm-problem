package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _4153 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input[] = br.readLine().split(" ");
		int line[] = new int[3];
		for(int i=0; i<line.length; i++) {
			line[i] = Integer.parseInt(input[i]);
		}
		
		while(line[0] != 0 && line[1] !=0 && line[2] !=0 ) {
			Arrays.sort(line);
			
			long line12 = (long) (Math.pow(line[0] ,2) + Math.pow(line[1] , 2));
			long longline = (long)(Math.pow(line[2] ,2));
			
			if( line12 == longline) {
				System.out.println("right");
			}
			else {
				System.out.println("wrong");
			}
			input = br.readLine().split(" ");
			for(int i=0; i<input.length; i++) {
				line[i] = Integer.parseInt(input[i]);
			}
			
		}
	}

}
