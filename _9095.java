package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9095 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int D[] = new int[11];
		
		/* 배열에 채워놓기 */
		D[1] = 1;
		D[2] = 2;
		D[3] = 4;
		for(int i=4; i<D.length; i++) {
			D[i] = D[i-3] + D[i-2] + D[i-1];
		}
		
		for(int i=0; i<T; i++) {
			int N = Integer.parseInt(br.readLine());
			System.out.println(D[N]);
		}
		br.close();
	
		
		
	}

}
