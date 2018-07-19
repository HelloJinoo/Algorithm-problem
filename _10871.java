package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10871 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		String N1[] = N.split(" ");
		
		int number[] = new int[Integer.parseInt(N1[0])];
		int compare = Integer.parseInt(N1[1]);
		
		String line = br.readLine();
		String line2[] = line.split(" ");
		
		for(int i=0; i<line2.length; i++) {
			if( compare > Integer.parseInt(line2[i])) {
				System.out.print(Integer.parseInt(line2[i])+" ");
			}
		}
	}

}
