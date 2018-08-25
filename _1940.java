package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1940 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int[] component = new int[N];
		String input[] = br.readLine().split(" ");
		for(int i=0; i<input.length; i++) {
			component[i] = Integer.parseInt(input[i]);
		}
		
		Arrays.sort(component);
		int count=0;
		
		for (int i=0; i<component.length; i++) {
			for (int j=component.length-1; j>i; j--) {
				if( i == j ) {
					continue;
				}
				else if (component[i]+component[j] == M) {
					count++; 
					}
				}
			}


		System.out.println(count);
	}

}
