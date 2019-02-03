import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3143 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());
		
		for(int test=1; test<=test_case; test++) {
			String input[] = br.readLine().split(" ");
			String text = input[0];
			String one_text = input[1];
			int count=0;
	
			for(int i=0; i<text.length(); i++) {
				if(text.charAt(i) == one_text.charAt(0)) {
					for(int j=1; j<one_text.length(); j++) {
						if(text.charAt(i+j) != one_text.charAt(j)){
							count++;
							i += j;
							break;
						}
						else if(j == one_text.length()-1) {
							count++;
							i = i+j;
						}
					}
					
				}
				else {
					count++;
				}
			
			}
			System.out.println("#"+test+" "+count);
			
		}
		
	}

}
