	package Back;
	
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	
	public class _1074 {
	
	
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line[] = br.readLine().split(" ");
			int N = Integer.parseInt(line[0]);
			int r = Integer.parseInt(line[1]);
			int c = Integer.parseInt(line[2]);
			
			int previndex = (int) (Math.pow(2, N) / 2);
			int result=0;
			
			while( previndex >= 2 ) {
			/*1사분면*/
			if( r < previndex && c < previndex) {
				result += 0;
			}
			/*2사분면*/
			else if( r < previndex && c >= previndex) {
				result += (previndex)*(previndex);
				c = c - previndex;
				
			}
			/*3사분면*/
			else if( r >= previndex && c < previndex) {
				result += 2*(previndex*previndex);
				r = r- previndex;
			}
			/*4사분면*/
			else if( r >= previndex && c >= previndex) {
				result += 3*(previndex*previndex);
				r = r-previndex;
				c= c- previndex;
				}
				N = N-1;
				previndex = (int) (Math.pow(2, N) / 2);
			}
		
			if( r % 2 == 0 && c % 2 ==0) {
				System.out.println(result);
			}
			else if( r%2 == 1 && c % 2 ==0) {
				System.out.println(result+2);
			}
			else if( r%2 == 0 && c % 2 ==1) {
				System.out.println(result+1);
			}
			else if( r%2 == 1 && c % 2 ==1 ) {
				System.out.println(result+3);
			}
		
	
		}
	}
