package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11006 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			String input[] = br.readLine().split(" ");
			int legcount = Integer.parseInt(input[0]);
			int chicken = Integer.parseInt(input[1]);
			int totallegcount = chicken * 2 ;
			
			int onefoot = totallegcount - legcount;
			System.out.print(onefoot);
			System.out.print(" ");
			System.out.println(chicken-onefoot);
		}
	}

}
