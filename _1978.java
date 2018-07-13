package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1978 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		int flag = 0;
		String number = br.readLine();
		String[] arr1 = number.split(" ");
		br.close();
	
		for (int i = 0; i < N; i++) {
			if( Integer.parseInt(arr1[i]) == 2) {
				count++;
			}
			else if( Integer.parseInt(arr1[i]) > 2) {
				for(int j=2; j < Integer.parseInt(arr1[i]); j++) {
					if(  Integer.parseInt(arr1[i]) % j == 0 ) {
						flag = 1;
					}
				}
				if( flag == 0 ) {
					System.out.println( Integer.parseInt(arr1[i]));
					count++;
				}
				flag= 0;
			}
	}
	
		System.out.print(count);
	}
}
