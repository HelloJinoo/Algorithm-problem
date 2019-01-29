/* SwExpertAcademy 5948	
 * 새샘이의 7-3-5 게임
 * 7개의 정수 중 3개를 골라 5번째로 큰 수 찾기
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _5948 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int test_case = Integer.parseInt(br.readLine());
	
	for(int test=1; test<=test_case; test++) {
		String input[] = br.readLine().split(" ");
		int number[] = new int[35]; //모든 3개의 합을 담을 배열
		int index=0;
		
		/*7개의 정수중 3개를 골라서 만들수 있는 모든 합*/
		for(int c=0; c<input.length-2; c++) {
			for(int next= c+1; next < input.length-1; next++) {
				for(int last=next+1; last<input.length; last++) {
					number[index] = Integer.parseInt(input[c]) + Integer.parseInt(input[next]) + Integer.parseInt(input[last]);
					index++;
				}
			}
		}
		Arrays.sort(number);	//오름차순
		
		int count=1;
		int comp = number[number.length-1];
		
		/*5번째로 큰 수 찾기*/
		for(int i=number.length-2; i>=0; i--) {
			if(comp != number[i]) {
				comp = number[i];
				count++;
			}
			
			if(count == 5) {
				System.out.println("#"+test+" "+number[i]);
				break;
			}
		}
		
	}
	}

}
