package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2355 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		long A = Long.parseLong(input[0]);
		long B = Long.parseLong(input[1]);
		
		if( A > B ) {
			long temp = B;
			B = A;
			A = temp;
		}
		
		
		long sumA =0;
		long sumB =0;
		if( A < 0 && B == 0 ) {
			A = Math.abs(A);
			sumA = (A*(A+1))/2;
			System.out.println(-sumA);
		}
		else if( A < 0 && B < 0) {
			A = Math.abs(A);
			B = Math.abs(B);
			sumA = (A*(A+1))/2;
			sumB = (B*(B-1))/2;
			System.out.println(-(sumA -sumB));
		}
		else if( A < 0 && B > 0) {
			 A = Math.abs(A);
			 sumA = (A*(A+1))/2;
			 sumB = (B*(B+1))/2;
			 System.out.println(-sumA+sumB);
		}
		else if( A > 0 && B > 0) {
			A = Math.abs(A);
			B = Math.abs(B);
			sumA = (A*(A-1))/2;
			sumB = (B*(B+1))/2;
		System.out.println(sumB - sumA);
		}
		else if( A == 0 && B > 0) {
			sumB = (B*(B+1))/2;
			System.out.println(sumB);
		}
		else if( A == 0 && B ==0) {
			System.out.println(0);
		}
	
	}

}
