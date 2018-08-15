package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1057 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line[] = br.readLine().split(" ");
		
		int N = Integer.parseInt(line[0]);
		int jimin = Integer.parseInt(line[1]);
		int hansoo = Integer.parseInt(line[2]);
		int round =1;
		if( hansoo > jimin && hansoo-1 == jimin && hansoo % 2== 0 ) {
			System.out.println(round);
		}
		else if(hansoo < jimin && hansoo == jimin-1 && jimin % 2== 0 ) {
			System.out.println(round);
		}else {
			while(true) {
				jimin = (jimin+1) /2;
				hansoo = (hansoo+1) /2;
				round++;
				if(	jimin > hansoo) {
					if( hansoo == jimin-1 && jimin % 2 ==0) {
						break;
					}
				}else {
					if( hansoo-1 == jimin &&hansoo % 2== 0) {
						break;
					}
				}
				
			}
			System.out.println(round);
		}
		

	}

}
