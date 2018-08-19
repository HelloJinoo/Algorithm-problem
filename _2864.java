package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2864 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line[] = br.readLine().split(" ");
		String A = line[0];
		String B = line[1];
		
		String minnumberA ="";
		String minnumberB ="";
		
		String maxnumberA="";
		String maxnumberB="";
		for(int i=0; i<A.length(); i++) {
		 if(A.charAt(i) == '6') {
			 minnumberA += "5";
		 }
		 else {
			 minnumberA += A.charAt(i);
		 }
		}
		
		for(int i=0; i<B.length(); i++) {
			if(B.charAt(i) =='6') {
				minnumberB +="5"; 
			}
			 else {
				minnumberB += B.charAt(i);
			 }
		}
		System.out.print(Integer.parseInt(minnumberA)+ Integer.parseInt(minnumberB)+ " ") ;
	
		for(int i=0; i<A.length(); i++) {
			 if(A.charAt(i) == '5') {
				 maxnumberA += "6";
			 }
			 else {
				 maxnumberA += A.charAt(i);
			 }
			}
			
			for(int i=0; i<B.length(); i++) {
				if(B.charAt(i) =='5') {
					maxnumberB +="6"; 
				}
				 else {
					 maxnumberB += B.charAt(i);
				 }
			}
			System.out.print(Integer.parseInt(maxnumberA)+ Integer.parseInt(maxnumberB)) ;
	}

}
