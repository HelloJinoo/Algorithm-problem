package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _5576 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int W[] = new int[10];
		int K[] = new int[10];
		for(int i=0; i<10; i++) {
			W[i] = Integer.parseInt(br.readLine());
		
		}
		for(int i=0; i<10; i++) {
			K[i] = Integer.parseInt(br.readLine());
		
		}
		Arrays.sort(W);
		Arrays.sort(K);
		
		int Wsum=0;
		int Ksum=0;
		for(int i=9; i>=7; i--) {
			Wsum += W[i];
			Ksum += K[i];
		}
		
		System.out.println(Wsum + " " + Ksum);
	}

}
