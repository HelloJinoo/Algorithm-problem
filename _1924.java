package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1924 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String Date[] = line.split(" ");
		
		int day = Integer.parseInt(Date[1]);
		
		for(int i=Integer.parseInt(Date[0]); i>=1; i--) {
			if(i-1 == 1 || i-1 ==3 || i-1 ==5 || i-1 == 7 || i-1 ==8 || i-1 ==10  ) {
				day += 31;
			}
			else if( i-1 == 4 || i-1 ==6 || i-1 ==9 || i-1 ==11 ) {
				day += 30;
			}
			else if( i-1==2) {
				day += 28;
			}
		}
		
		if( day % 7 == 1) {
			System.out.println("MON");
		}
		else if( day % 7 == 2){
			System.out.println("TUE");
		}
		else if( day % 7 == 3){
			System.out.println("WED");
		}
		else if( day % 7 == 4){
			System.out.println("THU");
				}
		else if( day % 7 == 5){
			System.out.println("FRI");
		}
		else if( day % 7 == 6){
			System.out.println("SAT");
		}
		else if( day % 7 == 0){
			System.out.println("SUN");		
				}
		
	}

}
