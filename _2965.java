package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2965 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String position[] = br.readLine().split(" ");
		int kangaroo1 = Integer.parseInt(position[0]);
		int kangaroo2 = Integer.parseInt(position[1]);
		int kangaroo3 = Integer.parseInt(position[2]);
		
		if(kangaroo3 - kangaroo2 > kangaroo2 - kangaroo1 ) {
			System.out.println(kangaroo3 - kangaroo2-1);
		}
		else {
			System.out.println(kangaroo2 - kangaroo1-1);
		}
	
	
	}

}
