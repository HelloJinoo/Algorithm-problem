package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1912 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int number[] = new int[N];
		
		String line = br.readLine();
		String line2[] = line.split(" ");
		
		for(int i=0; i<number.length; i++) {
			number[i] = Integer.parseInt(line2[i]);
		}
		int max=Integer.MIN_VALUE;
		int compare = 0;
		
		for(int i=0; i<number.length; i++) {
			 compare = number[i];
			 if( compare > max) {
				 max = compare;
			 }
			for(int j=i+1; j<number.length; j++) {
					compare += number[j];
				if(compare > max) {
					max = compare;
				}
		
			}
		}
		System.out.println(max);
	}

}
