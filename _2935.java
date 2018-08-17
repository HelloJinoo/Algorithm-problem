package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2935 {

	public static void main(String[] args) throws IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		String operator = br.readLine();
		String B = br.readLine();
		String result="1";
		
		if( operator.equals("*")) {
			for(int i=0; i<A.length()+B.length()-2; i++) {
				result +="0";
			}
			System.out.println(result);
		}
		else if(operator.equals("+")) {
			if(A.length() > B.length()) {
				for(int i=0; i<A.length()-B.length()-1; i++) {
					result +="0";
				}
				result += B;
			}
			else if(A.length() < B.length()) {
				for(int i=0; i<B.length()-A.length()-1; i++) {
					result +="0";
				}
				result += A;
			}
			else if(A.length()==B.length()) {
				int first=(A.charAt(0)-48)+(B.charAt(0)-48);
				result=""+first;
				for(int i=0; i<A.length()-1; i++) {
					result +="0";
				}
			}
			System.out.println(result);
		}
	}

}
