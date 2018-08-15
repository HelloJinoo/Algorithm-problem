package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class _1021 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String read[] = br.readLine().split(" ");
		
		Queue<Integer> q = new LinkedList();
		
		for(int i=1; i<=Integer.parseInt(read[0]); i++) {
			q.add(i);
		}
		String deletelist[] = br.readLine().split(" ");

		int count=0;
		int delcount=0;
		int a=0;
		while(delcount != Integer.parseInt(read[1])) {
		
			if( q.peek() == Integer.parseInt(deletelist[a]) ) {
				q.poll();
				a++;
				delcount++;
			}
			else {
				Iterator iter=  q.iterator();
				double index=0;
				while(iter.hasNext()) {
					int check = (int) iter.next();
					if( check == Integer.parseInt(deletelist[a])) {
						break;
					}else {
						index++;
					}
				}
	
				if(index < ((double)q.size())/2) {
					count += index;
				}
				else {
					count +=q.size()-index;
					
				}
				for(int i=0; i<index; i++) {
					int addplus = (int) q.poll();
					q.add(addplus);
				}
				
			}
		}
		
		System.out.println(count);
	}

}
