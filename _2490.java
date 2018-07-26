package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2490 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count=0;
		int role[][] = new int[3][4];
		
		for(int i=0; i<role.length; i++) {
			String line = br.readLine();
			String line2[] = line.split(" ");
			role[i][0] = Integer.parseInt(line2[0]);
			role[i][1] = Integer.parseInt(line2[1]);
			role[i][2] = Integer.parseInt(line2[2]);
			role[i][3] = Integer.parseInt(line2[3]);
		}
		
		 for(int j=0; j<role.length; j++) {
			for(int k=0; k < role[j].length; k++) {	
				if( role[j][k] ==1) {
					count++;
				}
			}
			if( count == 0) {
				System.out.println("D");
			}
			else if(count ==1 ) {
				System.out.println("C");
			}
			else if(count ==2 ) {
				System.out.println("B");
			}
			else if( count ==3 ) {
				System.out.println("A");
			}
			else if(count ==4){
				System.out.println("E");
			}
			count =0;
		 }
 
	}
	
}
	
