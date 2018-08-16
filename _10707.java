package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10707 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x =Integer.parseInt(br.readLine());
		
		int ybasic = Integer.parseInt(br.readLine());
		int yuselimit = Integer.parseInt(br.readLine());
		int yplusprice = Integer.parseInt(br.readLine());
		int joi = Integer.parseInt(br.readLine());
		
		int xprice = x *joi;
		int yprice=ybasic;
		
		if( joi > yuselimit) {
			yprice += (joi-yuselimit)*yplusprice;
		}
		
		if( xprice > yprice ) {
			System.out.println(yprice);
		}
		else {
			System.out.println(xprice);
		}
	}

}
