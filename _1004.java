package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1004 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		
		for(int test=0; test<T; test++) {
			String startdest[] = br.readLine().split(" ");
			
			
			int count = Integer.parseInt(br.readLine());
			
			int planet[][] = new int[count][3];
			
			for(int i=0; i< count; i++) {
				String line[] = br.readLine().split(" ");
				planet[i][0] = Integer.parseInt(line[0]);
				planet[i][1] = Integer.parseInt(line[1]);
				planet[i][2] = Integer.parseInt(line[2]);
			}
			
			int entryexit = 0;
			
			for(int i=0; i<planet.length; i++) {
				double distance = Math.pow(planet[i][0] - ( Integer.parseInt(startdest[0])),2 )+ Math.pow(planet[i][1] - (Integer.parseInt(startdest[1])),2 );
				double distance2 = Math.pow(planet[i][0] - ( Integer.parseInt(startdest[2])),2 )+ Math.pow(planet[i][1] - (Integer.parseInt(startdest[3])),2 );
				double radius = Math.pow(planet[i][2], 2);
				if( distance < radius && distance2 > radius || distance > radius && distance2 < radius  ) {
					entryexit++;
				}
			}
			
			System.out.println(entryexit);
			
		}
	}

}
