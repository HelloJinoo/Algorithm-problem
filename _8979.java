package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _8979 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line[] = br.readLine().split(" ");
		int country = Integer.parseInt(line[0]);
		int confirmcountry = Integer.parseInt(line[1]);
		int table[][] = new int[country][4];
		
		for(int i=0; i< country; i++) {
			String input[] = br.readLine().split(" ");
			table[i][0] = Integer.parseInt(input[0]);
			table[i][1] = Integer.parseInt(input[1]);
			table[i][2] = Integer.parseInt(input[2]);
			table[i][3] = Integer.parseInt(input[3]);
		}
		
		int confirmcountryindex=0;
		for(int i=0; i<table.length; i++) {
			if(table[i][0] == confirmcountry) {
				confirmcountryindex = i;
			}
			
		}
		int count=0;
		
		for(int i=0; i<table.length; i++) {
			if(table[i][0] == confirmcountry) {
				continue;
			}
			else {
					if(table[confirmcountryindex][1] < table[i][1]) {
						count++;
					}
					else if(table[confirmcountryindex][1] == table[i][1]) {
						if(table[confirmcountryindex][2] < table[i][2]) {
							count++;
						}
						else if(table[confirmcountryindex][2] == table[i][2]) {
							if(table[confirmcountryindex][3] < table[i][3]) {
								count++;
							}
						}
					}
				}
		}
		System.out.println(count+1);
	}
}
