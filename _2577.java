package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2577 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int N1 = Integer.parseInt(br.readLine());
		int N2 = Integer.parseInt(br.readLine());
		int N3 = Integer.parseInt(br.readLine());
		int mul = N1 * N2 * N3;
		int Number[] = new int[10];
		
		while(mul != 0) {
			switch(mul % 10) {
				case 0:
					Number[0]++;
					mul = mul/10;
					break;
				case 1:
					Number[1]++;
					mul = mul/10;
					break;
				case 2:
					Number[2]++;
					mul = mul/10;
					break;
				case 3:
					Number[3]++;
					mul = mul/10;
					break;
				case 4:
					Number[4]++;
					mul = mul/10;
					break;
				case 5:
					Number[5]++;
					mul = mul/10;
					break;
				case 6:
					Number[6]++;
					mul = mul/10;
					break;
				case 7:
					Number[7]++;
					mul = mul/10;
					break;
				case 8:
					Number[8]++;
					mul = mul/10;
					break;
				case 9:
					Number[9]++;
					mul = mul/10;
					break;
			}
		}
		
		for(int i=0; i<Number.length; i++) {
			System.out.println(Number[i]);
		}
	}
}
