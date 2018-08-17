package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10984 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			int subject = Integer.parseInt(br.readLine());
			
			int hakjum=0;
			double sungjuck=0;
			for(int j=0; j<subject; j++) {
				String score[] = br.readLine().split(" ");
				hakjum += Integer.parseInt(score[0]);
				sungjuck += ( Double.parseDouble(score[1]) * Integer.parseInt(score[0]));
			}
	
			System.out.print(hakjum+" ");
			System.out.println(Math.round((sungjuck / hakjum)*10) /10.0);
		}
		
	}

}
