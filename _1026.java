package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1026 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int a[] = new int[N];
		String line[] = br.readLine().split(" ");
		for(int i=0; i <a.length; i++) {
			a[i] = Integer.parseInt(line[i]);
		}
		
		int b[] = new int[N];
		line = br.readLine().split(" ");
		for(int i=0; i <b.length; i++) {
			b[i] = Integer.parseInt(line[i]);
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int sum =0;
		for(int i=0; i<a.length; i++) {
			sum += a[i] * b[b.length-1-i];
		}

		System.out.println(sum);
	}
}
