package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _11052 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		String line[] = br.readLine().split(" ");
		int setmenu[] = new int[count+1];
		int dp[] = new int[count+1];
		for(int i=0; i<line.length; i++) {
			setmenu[i+1] = Integer.parseInt(line[i]);
		}
		
		for(int i=2; i<setmenu.length; i++) {
			for(int j=0; j<=i; j++) {
				if(setmenu[j]+ setmenu[i-j] >setmenu[i]) {
					setmenu[i] = setmenu[j]+ setmenu[i-j];
				}
			}
		}
		
		System.out.println(setmenu[setmenu.length-1]);
		
	
		
	}

}
