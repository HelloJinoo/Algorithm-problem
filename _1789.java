package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1789 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long sum =Long.parseLong(br.readLine());
		long count=0;
		long plus = 0;

		for(int i=1; ;i++) {
			plus +=i;
			count++;
			if( plus > sum ) {
				count--;
				break;
			}
		}
		System.out.println(count);
		
	}

}
