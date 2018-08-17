package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1159 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int player = Integer.parseInt(br.readLine());
		int name[] = new int[26];
		
		
		for(int i=0; i< player; i++) {
			String playername = br.readLine();
			name[playername.charAt(0)-97]++;
		}
		int noplayer =0;
		
		for(int i=0; i<name.length; i++) {
			if(name[i] >=5) {
				System.out.print((char)(i+97));
				noplayer=1;
			}
		}
		if(noplayer ==0) {
			System.out.println("PREDAJA");
		}
		
	}

}
