package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2193 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long dp[] = new long[N+1];    // ※범위때문에 long으로 함. 
		
		dp[0] = 0;
		dp[1] = 1;
		
		for(int i=2; i<dp.length; i++) {
			dp[i] = dp[i-2] + dp[i-1];
		}
		System.out.println(dp[N]);    
		
	
		/* 범위 제한이 없을 시에는 맞는 풀이 이지만, count,How에서 범위가 넘어가게됨. */
		/*int a = N-1;
		long count=0;
		int check=0;
		long How=1;
		for(int i =0; i< N; i++) {
			How *=2;
		}
		int Binary[] = new int[N];
		for(int i=1; i<How; i++) {
			int w = i;
			while( w != 0 && a>=0) {
				Binary[a] = w % 2;
				a = a-1;
				 w = w /2;
			}
			for(int k=0; k<Binary.length-1; k++) {
				if(Binary[0] == 0) {
					check =1;
					break;
				}
				else if(Binary[k] ==1 && Binary[k+1] == 1){
					check=1;
					break;
				}
				else {
					continue;
				}
			}
			if(check == 0) {
				count++;
			}else {
				check=0;
			}
			a =N-1;
		}
		System.out.println(count);  
		
		
		*/
	}

}
