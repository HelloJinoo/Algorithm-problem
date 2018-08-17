package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5532 {

	public static void main(String[] args) throws IOException {
	

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int totalvacation = Integer.parseInt(br.readLine());
		int totalkorean = Integer.parseInt(br.readLine());
		int totalmath = Integer.parseInt(br.readLine());
		int limitkorean= Integer.parseInt(br.readLine());
		int limitmath = Integer.parseInt(br.readLine());
		
		int koreanday = totalkorean/limitkorean;
		int mathday = totalmath / limitmath;
		if( totalkorean % limitkorean !=0) {
			koreanday++;
		}
		if(totalmath % limitmath !=0) {
			mathday++;
		}
		if( koreanday > mathday) {
			System.out.println(totalvacation-koreanday);
		}
		else {
			System.out.println(totalvacation-mathday);
		}
	}

}
