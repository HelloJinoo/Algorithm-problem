package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5567 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		boolean f[] = new boolean[N+2];
		f[1] = true;
		int fof = Integer.parseInt(br.readLine());
		int list[][] = new int[fof][2];
		int count=0;
		boolean invite[] = new boolean[N+2];
		invite[1] =true;
		
		for(int i=0; i< fof; i++) {
			String line = br.readLine();
			String line2[] = line.split(" ");
			list[i][0] = Integer.parseInt(line2[0]);
			list[i][1] = Integer.parseInt(line2[1]);
		}
	
		for(int i=0; i<list.length; i++) {
			if(list[i][0] == 1) {
					invite[list[i][1]] = true;
					f[list[i][1]] =true;
					count++;
			}
			else if(list[i][1] ==1) {
				invite[list[i][0]] = true;
				f[list[i][0]] = true;
				count++;
			}
		}
		
		for(int i=0; i<list.length; i++) {
			 if(invite[list[i][0]] == true && f[list[i][0]] ==true) {
				if(invite[list[i][1]] == false) {
					invite[list[i][1]] = true;
					count++;
				}
			}
			 else if(invite[list[i][1]] == true && f[list[i][1]] ==true ) {
				 if(invite[list[i][0]] == false) {
						invite[list[i][0]] = true;
						count++;
					}
			 }
		}
		System.out.println(count);
	}

}
