package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11047 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String T = br.readLine();
		String T1[] = T.split(" ");
		int N = Integer.parseInt(T1[0]);
		int coin[] = new int[N];
		int money = Integer.parseInt(T1[1]);
		int count = 0;

		for (int i = 0; i < N; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}

		for(int i=coin.length-1; i>=0; i--) { 
			  count += money / coin[i]; 
			  money = money - ( money / coin[i] ) * coin[i] ;
		}
		System.out.println(count);

	}

}
