package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2863 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line[] = br.readLine().split(" ");
		String line2[] = br.readLine().split(" ");
		
		int A = Integer.parseInt(line[0]);
		int B = Integer.parseInt(line[1]);
		int C = Integer.parseInt(line2[0]);
		int D = Integer.parseInt(line2[1]);
		double result[] = new double[4];
		
			result[0] = (double)A/C + (double)B/D;
			result[1] = (double)C/D + (double)A/B;
			result[2] = (double)D/B + (double)C/A;
			result[3] = (double)B/A + (double)D/C;
			
			double max = result[0];
			int index =0;
			for(int i=1; i<result.length; i++) {
				if(max < result[i]) {
					max = result[i];
					index =i;
				}
			}
			System.out.println(index);
		

	}

}
