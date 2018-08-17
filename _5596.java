package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5596 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String mingook[] = br.readLine().split(" ");
		String mansae[] = br.readLine().split(" ");
		
		int totalmingook =0;
		int totalmansae=0;
		for(int i=0; i<mingook.length; i++) {
			totalmingook += Integer.parseInt(mingook[i]);
		}
		for(int i=0; i<mansae.length; i++) {
			totalmansae += Integer.parseInt(mansae[i]);
		}
		
		if( totalmingook >= totalmansae) {
			System.out.println(totalmingook);
		}
		else {
			System.out.println(totalmansae);
		}

	}

}
