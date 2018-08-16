package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5063 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			String input[] = br.readLine().split(" ");
			int noadver = Integer.parseInt(input[0]);
			int adver = Integer.parseInt(input[1]);
			int adverprice = Integer.parseInt(input[2]);
			
			if( noadver < adver - adverprice) {
				System.out.println("advertise");
			}
			else if( noadver > adver - adverprice) {
				System.out.println("do not advertise");
			}
			else {
				System.out.println("does not matter");
			}
		}
	}

}
