package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1075 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		int F = Integer.parseInt(br.readLine());
		
		String number = "";
		
		for(int i=0; i<N.length()-2; i++) {
			number += N.charAt(i);
		}
		
		for(int i=0; i<=99; i++) {
			String prev = number;
			if( i>=0 && i<=9) {
				number = number + "0" + i;
			}
			else {
				number = number + i;
			}
			
			
			if(Long.parseLong(number) % F ==0 ) {
			String result = ""+number.charAt(number.length()-2) + number.charAt(number.length()-1);  
				System.out.println(result);
				break;
			}
			else {
				number = prev;
			}
		}
		

	}

}
