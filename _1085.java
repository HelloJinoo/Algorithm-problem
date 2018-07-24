package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1085 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N =br.readLine();
		
		String N2[] = N.split(" ");
		int x = Integer.parseInt(N2[0]);
		int y = Integer.parseInt(N2[1]);
		int w = Integer.parseInt(N2[2]);
		int h = Integer.parseInt(N2[3]);
		
		int[] min = new int[4];
		 min[0] = h-y;
	     min[1] = w-x;
	     min[2] = x;
		 min[3] = y;
		
		Arrays.sort(min);
		System.out.println(min[0]);
		
		
	}

}
