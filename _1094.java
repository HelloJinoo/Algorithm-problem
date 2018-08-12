package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;


public class _1094 {



	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cm = Integer.parseInt(br.readLine());
		
		int stick[] = new int[6];
		int count =1;
		stick[0] = 64;
		
		
		while( sumstick(stick) != cm ) {
				 int index = minstick(stick);
				 int half = stick[index] /2;
				 if( sumstick(stick) - half >= cm ) {
					 stick[index] = half;
				 }
				 else {
					 stick[index] = half;
					 stick[index+1] = half;
					 count++;
				 }
		}
		
		System.out.println(count);
		
	}
	
	public static int sumstick(int a[]) {
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public static int minstick(int a[]) {
		int min = 65;
		int index = 0;
		for(int i=0; i<a.length; i++) {
			if(min >= a[i] && a[i] !=0) {
				min = a[i];
				index =i;
			}
		}
		return index;
	}

}
