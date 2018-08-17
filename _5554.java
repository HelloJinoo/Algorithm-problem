package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5554 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int homeToschool= Integer.parseInt(br.readLine());
		int schoolTopc = Integer.parseInt(br.readLine());
		int pcToacademy =Integer.parseInt(br.readLine());
		int academyTohome = Integer.parseInt(br.readLine());
		
		int totaltimesec = homeToschool+schoolTopc+pcToacademy+academyTohome;
		
		int minute = totaltimesec / 60;
		int sec = totaltimesec % 60;
		System.out.println(minute);
		System.out.println(sec);
	}

}
