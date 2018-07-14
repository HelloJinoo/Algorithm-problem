package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1463 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int arr[] = new int[N + 1];
	

		for (int i = 2; i < arr.length; i++) {
			arr[i] = 1 + arr[i - 1];
			
			if (i % 2 == 0) {
				if( arr[i] >  1 + arr[i / 2]) {
				arr[i] = 1 + arr[i / 2];
				}
			}
			if (i % 3 == 0) {
				if(arr[i] > 1 + arr[i / 3] ) {
					arr[i]= 1 + arr[i / 3];
				}
			}
		}
		System.out.println(arr[N]);
	}

}
