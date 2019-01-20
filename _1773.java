/* Baekjoon 1773
 * firecracker show
 * ÆøÁ×¼î°¡ ½ÃÀÛµÇ°í ³¡³¯ ¶§±îÁö ¹ãÇÏ´Ã¿¡ ÆøÁ×À» º¼ ¼ö ÀÖ´Â ÃÑ ½Ã°£À» Ãâ·Â
 */
package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1773 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int student = Integer.parseInt(input[0]); // »ç¶÷¼ö
		int time = Integer.parseInt(input[1]);  //ÆøÁ×ÀÌ ³¡³ª´Â ½Ã°£
		
		int firecracker[] = new int[time+1]; //½Ã°£º° ÆøÁ× ¿©ºÎ
		
		int delay[] = new int[student];
		for( int i=0; i< student; i++) {
			delay[i] = Integer.parseInt(br.readLine());
		}
			
		int count = 0;
		for(int i=1; i<firecracker.length; i++) {
			for(int j=0; j<delay.length; j++) {
				if(i % delay[j] == 0 && firecracker[i] == 0 ) { //ÆøÁ× ÁÖ±â È®ÀÎ & ´Ù¸¥ ÆøÁ×µµ ÅÍÁö´Â °æ¿ìÀÎÁö È®ÀÎ
					firecracker[i]++;
					count++;  //ÆøÁ× ÅÍÁü
				}
			}
		}
		
		System.out.println(count);

	}

}
