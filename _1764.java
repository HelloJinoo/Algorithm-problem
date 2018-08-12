package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class _1764 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);
		
		Set<String> nSet = new HashSet<String>(); 
		String[] mSet = new String[M];
		Set<String> result = new HashSet<String>();

		for(int i=0; i<N; i++) {
			nSet.add(br.readLine());
		}
		
		for(int j=0; j<M; j++) {
			mSet[j] = br.readLine();
		}
		
		for(int i=0; i<M; i++) { 
			if(nSet.contains(mSet[i]) == true) {
				result.add(mSet[i]); 
				} 
			}
		String[] tmp=result.toArray(new String[result.size()]);
		Arrays.sort(tmp);
		 System.out.println(tmp.length); 
		 for(int i=0; i<tmp.length;i++) {
			 System.out.println(tmp[i]); 
		 }

	}

}
