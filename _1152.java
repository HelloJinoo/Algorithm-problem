package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1152 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = br.readLine();
		int count=0;
		String many[] = line.split(" ");
		
		for(int i=0; i< many.length; i++) {
			if(!many[i].equals("")) {
				count++;
			}
		}
		System.out.println(count);
	}

}
