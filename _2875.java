package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2875 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String n[] = line.split(" ");
		int w = Integer.parseInt(n[0]);
		int m = Integer.parseInt(n[1]);
		int c = Integer.parseInt(n[2]);
		int count=0;
		
		while(true) {
			if( w  >= 2 && m >= 1) {
				w -=2;
				m -=1;
				count++;
			}
			else {
				break;
			}
		}
		while( w+m < c) {
			w +=2;
			m +=1;
			count--;
		}
		
		System.out.println(count);
		
	}

}
