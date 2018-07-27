package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10797 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count=0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
			while(st.hasMoreTokens()) {
				if(N == Integer.parseInt(st.nextToken())) {
					count++;
				}
			}
			System.out.println(count);
	}

}
