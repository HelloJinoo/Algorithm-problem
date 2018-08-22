package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2909 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		
		String C = input[0];
		int k = Integer.parseInt(input[1]);
		if( k == 0) {
			System.out.println(Integer.parseInt(C));
		}
		else if( C.length()- k <0 ) {
			System.out.println(0);
		}
		else if( C.length() -k == 0) {
			if( (C.charAt(0)-48)<5) {
				int Down = (int) (Integer.parseInt(C) / Math.pow(10, k-1));
				int c_result = (int) (Down * Math.pow(10,k-1));
				
				System.out.println(c_result);
			}
			else {
				int Up = (int) ((Integer.parseInt(C)+(5*Math.pow(10, k-1))) / Math.pow(10, k));
				int c_result = (int) (Up * Math.pow(10,k));
				System.out.println(c_result);
			}
		}
		else if( C.length() - k > 0) {
			if( (C.charAt(C.length()-k)-48)<5) {
				int Down = (int) (Integer.parseInt(C) / Math.pow(10, k));
				int c_result = (int) (Down * Math.pow(10,k));
				
				System.out.println(c_result);
			}
			else {
				int Up = (int) ((Integer.parseInt(C)+(5*Math.pow(10, k-1))) / Math.pow(10, k));
				int c_result = (int) (Up * Math.pow(10,k));
				System.out.println(c_result);
			}
		}
		}

}
