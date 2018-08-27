package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1138 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String line[] = br.readLine().split(" ");
		int result[] = new int[N];
		int posi[] = new int[N];
		
		for(int i=0; i<line.length; i++) {
			posi[i] = Integer.parseInt(line[i]);
		}

		for(int i=0; i<posi.length; i++) {
				result[search(posi[i], result)] = i+1;
		}
		
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]+ " ");
		}
		
	}

	private static int search(int j, int a[]) {
		int count=0;
		int index=0;
		for(int i=0; i<a.length; i++) {
			if(a[i] ==0) {
				count++;
				if( count > j) {
					index = i;
					break;
				}
			}
		}
		return index;
	}

}
