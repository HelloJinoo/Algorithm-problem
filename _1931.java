package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class _1931 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = 1;

		int arr[][] = new int[N][2];
		String line;

		for (int i = 0; i < arr.length; i++) {
			line = br.readLine();
			String a[] = line.split(" ");
			arr[i][0] = Integer.parseInt(a[0]);
			arr[i][1] = Integer.parseInt(a[1]);
		}

		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] < o2[1]) {
					return -1;
				} else if (o1[1] == o2[1]) {
					if (o1[0] < o2[0]) {
						return -1;
					} else if (o1[0] == o2[0]) {
						return 0;
					}
				}
				return 1;
			}
		});

		int index=0;
		for (int g = 1; g < arr.length; g++) {
				if (arr[index][1] <= arr[g][0]) {
					count++;
					index = g ;
			}
		}
		System.out.println(count);

	}

}
