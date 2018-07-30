package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1037 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int a[] = new int[N];
		String line = br.readLine();
		String line2[] = line.split(" ");
		for(int i=0; i<a.length; i++) {
			a[i] = Integer.parseInt(line2[i]);
		}
		Arrays.sort(a);
		
		System.out.println(a[0] * a[a.length-1]);
	}

}
