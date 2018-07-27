package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class _10610 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		
		int sum=0;
	
		String result = "";
		
		 	int a[] = new int[N.length()];
		 	
		 	for(int i =0; i< a.length; i++) {
				a[i] = N.charAt(i)-48;
				sum +=a[i];
			}

			Arrays.sort(a);
		if(a[0] == 0 && sum % 3 ==0 ) {
				for(int k=a.length-1; k>=0; k--) {
					result += a[k];					
				}
				System.out.println(result);

			}
		else {
			System.out.println("-1");
		}
	}
}
