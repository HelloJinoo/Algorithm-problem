package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1013 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for( int test =0; test< T; test++) {
			String spread = br.readLine();
			
			String check = "";
			if(spread.length() ==1) {
				System.out.println("NO");
			}
			else {	
			for(int i=0; i<spread.length(); i++) {
				if(check.equals("")) {
					check += spread.charAt(i);
					if(i+1<spread.length()) {
						continue;
					}
					else {
						System.out.println("NO");
						break;
					}
				}
				if(i ==spread.length()-1 && spread.charAt(i) =='0') {
					System.out.println("NO");
					break;
				}
				if(check.charAt(0) == '0') {	
					if( spread.charAt(i) =='1') {
						check="";
					}
					else {
						System.out.println("NO");
						break;
					}
				}
				else if( check.charAt(0) == '1') {
					if( spread.charAt(i) == '0') {
						if(check.length() < 3) {
							check += spread.charAt(i);
						}
						else {
							if(check.charAt(check.length()-1) =='0' &&check.charAt(check.length()-2)=='0' ){
								check +=spread.charAt(i);
							}
							else if( check.charAt(check.length()-1) =='1' &&check.charAt(check.length()-2)=='1'){
								if(i+1 < spread.length()) {
									if( spread.charAt(i+1) == '0') {
										check = "10";
									}
									else {
										check = "0";
									}
								}
							}
			
							else if( check.charAt(check.length()-1) =='1' &&check.charAt(check.length()-2)=='0'  ){
								check = "0";
							}
						}
					}
					/*1ÀÏ°æ¿ì*/
					else {
						if(check.length()<3) {
							System.out.println("NO");
							break;
						}
						else {
							check +=spread.charAt(i);
						}
					}
				}
				if(i == spread.length()-1 ) {
					System.out.println("YES");
				}
			}

		}
			
		}
	}	
}