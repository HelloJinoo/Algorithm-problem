package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10409 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int T = Integer.parseInt(input[1]);
		
		String line[] = br.readLine().split(" ");
		int totaltime=0;
		int count=0;
		for(int i=0; i<line.length; i++) {
			totaltime += Integer.parseInt(line[i]);
			if( totaltime <= T) {
				count++;
			}
			else {
				break;
			}
		}
		System.out.println(count);

	}

}
