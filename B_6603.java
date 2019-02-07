/* Baekjoon 6603	
 * 로또
 * k(k>6)개의 수를 골라 집합 S를 만든 다음 그 수만 가지고 번호를 선택한 6개의 번호 조합 출력
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_6603 {

	static String[] str;
	static int[] visited;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		while(true) {
			String input[] = br.readLine().split(" ");
			int k = Integer.parseInt(input[0]);
			str = new String[k];
			visited = new int[k]; //방문 여부 확인
			if(k == 0) {
				break;
			}
		
			for(int i=0; i <str.length; i++) {
				str[i] = input[i+1];
			}
			
			dfs(0,0);
			System.out.println();
	
		}
		
		

	}

	private static void dfs(int start, int depth) {
		if(depth == 6) {
			print_result();
		}
		
		/*dfs*/
		for(int i=start; i<visited.length; i++) {
			visited[i] = 1;
			dfs(i+1, depth+1);
			visited[i] = 0;
		}
		
	}

	/*출력문*/
	private static void print_result() {
		for(int i=0; i<str.length; i++) {
			if(visited[i] == 1) {
				System.out.print(str[i]+" ");
			}
		}
		System.out.println();
		
	}

}
