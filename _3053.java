package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3053 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int radius = Integer.parseInt(br.readLine());

		String circle = String.format("%.6f", Math.PI * radius * radius);
		String taxi = String.format("%.6f", (double)2 * radius * radius);
		
		System.out.println(circle);
		System.out.println(taxi);
	}

}
