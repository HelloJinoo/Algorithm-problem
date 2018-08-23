package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1712 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line[] = br.readLine().split(" ");
		int A = Integer.parseInt(line[0]);
		int B = Integer.parseInt(line[1]);
		int C = Integer.parseInt(line[2]);
		if(B >= C) {
			System.out.println(-1);
		}
		else {
		
			int sellprice = C-B;
			int totalsell = (A/sellprice) +1;

			System.out.println(totalsell);
		
			
		}
	}

}
