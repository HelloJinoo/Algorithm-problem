package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5032 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line[] = br.readLine().split(" ");
		int possesion = Integer.parseInt(line[0]);
		int find = Integer.parseInt(line[1]);
		int change = Integer.parseInt(line[2]);
		
		int totalpossesion = find+possesion;
		int beverage = totalpossesion / change;
		int drink = beverage;
		
		possesion = (totalpossesion % change) + drink; 
		while( possesion >= change) {
			beverage = possesion /change;
			drink += beverage;
			possesion = ( possesion % change) + beverage;
		}
		
		System.out.println(drink);

	}

}
