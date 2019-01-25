/* Sw Expert Academy 4698
 * 테네스의 특별한 소수
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4698 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean demical[] = new boolean[1000001];
		demical[1] = true;
	
		int tmp;
		/*소수찾기*/
		for(int i=2; i< demical.length/2; i++) {
            int k=2;
            while((tmp = i*k) < demical.length) {
                demical[tmp] = true; //소수가 아닌수
                k++;
            }
        }
	
		int test_case = Integer.parseInt(br.readLine());
		for(int test=1; test<=test_case; test++) {
			String input[] = br.readLine().split(" ");
			int min_range = Integer.parseInt(input[1]);
			int max_range = Integer.parseInt(input[2]);
			int result_count=0;
			for(int r=min_range; r <= max_range; r++) {
				if(demical[r] == false) { //소수 중
					if( Integer.toString(r).contains(input[0])) { //포함하길 원하는 숫자가 있는지 확인
						result_count++;
					}
				}
			}
			System.out.println("#"+test+" "+result_count);
		}
	}
}
