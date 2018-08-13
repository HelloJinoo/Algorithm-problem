package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class _11053 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		String line[] = br.readLine().split(" ");
				
		int number[] = new int[T];
		for(int i=0; i<number.length; i++) {
			number[i] = Integer.parseInt(line[i]);
		}
		int count[] = new int[T];
		count[0] = 1;
		
		for(int i=1; i<number.length; i++) {
			int maxcount = 0;
			int nomin = 0;
			for(int j=0; j<i; j++) {
				if( number[i] > number[j] && maxcount < count[j]+1) {
					count[i] = count[j]+1;
					maxcount = count[i];
					nomin =1;
				}
			}
			if( nomin == 0) {
				count[i] = 1;
			}
			
		}	
		Arrays.sort(count);	
		System.out.println(count[count.length-1]);
	}

}
