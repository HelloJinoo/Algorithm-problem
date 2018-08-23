package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1297 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int TVcross = Integer.parseInt(input[0]);
		int width = Integer.parseInt(input[1]);
		int height = Integer.parseInt(input[2]);
		
	
		  double a = TVcross / Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
		  System.out.print((int)(width*a));
		  System.out.print(" ");
		  System.out.println((int)(height*a));

	}

}
