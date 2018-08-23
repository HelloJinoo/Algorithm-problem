package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1350 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String input_size[] = br.readLine().split(" ");
		int size[] = new int[N];
		for(int i=0; i<input_size.length; i++) {
			size[i] = Integer.parseInt(input_size[i]);
		}
		int clustsize = Integer.parseInt(br.readLine());
		long result= 0;
		int size_of_one_piece_count = 0;
		for(int i=0; i<size.length; i++) {
			if( size[i] % clustsize ==0) {
				size_of_one_piece_count = size[i] / clustsize;
			}
			else{
				size_of_one_piece_count =(size[i] / clustsize)+1;
			}
			long size_of_one_piece = (long)size_of_one_piece_count * clustsize;
				result += size_of_one_piece;
		}
		 System.out.println(result);
	}

}
