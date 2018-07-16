package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _11399 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		int min[] = new int[T];
		int time[] = new int[T+1];
		int sum = 0;
		String read = br.readLine();
		String minute[] = read.split(" ");

		for (int i = 0; i < minute.length; i++) {
			min[i] = Integer.parseInt(minute[i]);
		}
		Arrays.sort(min);

		for (int j = 1; j < time.length; j++) {
			time[j] = time[j-1]+min[j-1];
			sum += time[j];
		}
		
		
		System.out.print(sum);

	}
}
