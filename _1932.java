package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1932 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		
		int dp[] = new int[N];
		int store[] = new int[N];
		int first = Integer.parseInt(br.readLine());
	if(N == 1) {
		System.out.println(first);
	}
		
	else{
		String line[] = br.readLine().split(" ");
		dp[0] = first + Integer.parseInt(line[0]);
		dp[1] = first + Integer.parseInt(line[1]); 
		store[0] =first + Integer.parseInt(line[0]);
		store[1] = first + Integer.parseInt(line[1]);
	
	
		for(int i=0; i<N-2; i++) {
			String a = br.readLine();
			line = a.split(" ");
			
			for(int j=0; j<line.length; j++) {
				if(j ==0 ) {
					dp[j] = store[j] + Integer.parseInt(line[j]);
				}
				else if( j == line.length-1) {
					dp[j] = store[j-1] + Integer.parseInt(line[j]);
				}
				else {
						if(store[j-1] +Integer.parseInt(line[j]) > store[j] + Integer.parseInt(line[j]) ) {
							dp[j] = store[j-1] +Integer.parseInt(line[j]);
							}	
						else {
							dp[j] = store[j] + Integer.parseInt(line[j]);
							}
					}
				}
			
			for(int q=0; q<dp.length; q++) {
				store[q] = dp[q];
			}
			}
			
		Arrays.sort(dp);
		System.out.println(dp[dp.length-1]);
		
		}
	}

}
