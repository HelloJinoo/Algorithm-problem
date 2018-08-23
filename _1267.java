package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1267 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String line[] = br.readLine().split(" ");
		
		/*¿µ½Ä*/
		long Yprice =0;
		long Mprice =0;
 		for(int i=0; i<line.length; i++) {
			long time = (Long.parseLong(line[i])/30)+1;
			Yprice += time * 10;
		}
		/*¹Î½Ä*/
		for(int i=0; i<line.length; i++) {
			long time = (Long.parseLong(line[i])/60)+1;
			Mprice += time * 15;
		}
		
		if( Yprice > Mprice ) {
			System.out.print("M "+Mprice );
		}
		else if( Yprice < Mprice) {
			System.out.println("Y "+Yprice  );
		}
		else {
			System.out.println("Y M "+Yprice);
		}

	}

}
