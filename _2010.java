package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2010 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
	
		int[] plug = new int[N];
		for(int i=0; i<N; i++) {
			 plug[i] = Integer.parseInt(br.readLine());
		}
		
		int max = plug[0];
		for(int i=1; i<plug.length; i++) {
			  max = max + plug[i]-1;
		}
		System.out.println(max);
		
	}

}
