package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2884 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String time[] = br.readLine().split(" ");
		int hour = Integer.parseInt(time[0]);
		int minute = Integer.parseInt(time[1]);
		
		if(minute >=45) {
			System.out.println(hour+ " " + (minute-45));
		}
		else {
			int redundancy = 45-minute;
			if(hour-1 <0) {
				System.out.println("23" + " " +(60-redundancy));
			}
			else {
				
				System.out.println(hour-1+" "+ (60-redundancy) );
				 
			}
		}
		
	}

}
