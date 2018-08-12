package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class _2960 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		boolean delete[] = new boolean[Integer.parseInt(input[0])+1];
		
		Queue q = new LinkedList<>();
		
		int toN[] = new int[Integer.parseInt(input[0])+1];
		for(int i=2; i<toN.length; i++) {
			toN[i] = i;
			int count=0;
			for(int j=1; j<=i; j++) {
				if( i % j == 0) {
					count++;
				}
			}
			if( count == 2) {
				q.add(i);
			}
		}
		int delcount=0;
		while( delcount !=Integer.parseInt(input[1]) ){
			int mul=(int) q.poll();
			int a =1;
			for(int i=mul; i< toN.length; i = mul * a) {
				if( delete[i] == false) {
					delete[i] = true;
					delcount++;
					if( delcount == Integer.parseInt(input[1])) {
						System.out.println(toN[i]);
						break;
					}		
				}
				a++;
			}
		}
		
		
	}

}
