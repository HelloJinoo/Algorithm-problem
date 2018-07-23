package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1068 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int tree[] = new int[N];
		int del[] = new int[N];
		int count =0;
		int leaf=0;
		String line = br.readLine();
		String line2[] = line.split(" "); 
		 for(int i=0; i<tree.length; i++) {
			 tree[i] = Integer.parseInt(line2[i]);
			 del[i] = Integer.parseInt(line2[i]);
			 }
		 
		int remove = Integer.parseInt(br.readLine());
	
		
		for(int i=0; i<tree.length; i++) {
			if( i == remove) {
				del[i] = -2;
			}
			else if( search(tree, i , remove) == remove) {
				del[i] = -2;
			}
		}
		
		
		for(int i=0; i<del.length; i++) {
			if(del[i] < -1) {
				continue;
			}
			for(int j=0; j<del.length; j++) {
				if( del[j] == i) {
					count++;
				}
			}
			if(count == 0) {
				leaf++;
			}
			else {
				count=0;
			}
		}
		
		System.out.println(leaf);
	}
	
	public static int search(int a[] , int i , int remove) {
		
	   		if( a[i] == remove ) {
	   			return remove;
	   		}else if( a[i] >= 0) {
	   			return search( a , a[i] , remove);
	   		}
	   		else {
	   			return i;
	   		}
		}
	
}
