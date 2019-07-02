import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

public class B_2667 {

		static boolean[][] visited;
		static int count_a = 0;
		static LinkedList<Integer> a = new LinkedList<Integer>();
		static LinkedList<Integer> count_list = new LinkedList<Integer>();
		static int[] count_ar;
		static int idx= 0;
		
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[][] map = new String[N][N]; //아파트 지도
		visited = new boolean[N][N]; //방문 여부
		
		count_ar = new int[N*N];	//아파트 단지 별 갯수
		
		
		/*input*/
		for(int row=0; row<N; row++) {
			String input = br.readLine();
			for(int col=0; col<input.length(); col++) {
				map[row][col] = Character.toString(input.charAt(col));
			}
		}
		
		/*각 단지 별 갯수 및 단지 수 확인 */
		for(int row=0; row<N; row++) {
			for(int col=0; col<N; col++) {
				if(!map[row][col].equals("0") && visited[row][col] == false) {
					count_a = 1;
					apartment(row,col,N,map);
					
				}
				else {
					visited[row][col] = true;
				}
			}
		}
		/*출력을 위한*/
		System.out.println(count_list.size());
		Arrays.sort(count_ar);
		for(int j=0; j<count_ar.length; j++) {
			if(count_ar[j] != 0 ) {
				System.out.println(count_ar[j]);
			}
		}
		


	}

	private static void apartment(int x, int y,int N , String[][] map) {
		visited[x][y] = true;
		
			/*아래*/
			if(x+1 < N &&  !map[x+1][y].equals("0")  && visited[x+1][y] ==false) {
				a.add(1);
				count_a++;
				apartment(x+1,y, N ,map);
				a.pop();
			}
			/*위*/
			if(x-1 >= 0 &&  !map[x-1][y].equals("0") && visited[x-1][y] ==false) {
				a.add(1);
				count_a++;
				apartment(x-1,y, N,map);
				a.pop();
			}
			/*왼쪽*/
			if(y-1 >= 0&&  !map[x][y-1].equals("0") && visited[x][y-1] ==false) {
				a.add(1);
				count_a++;
				apartment(x,y-1, N ,map);
				a.pop();
			}
			/*오른쪽*/
			if(y+1 < N &&  !map[x][y+1].equals("0")&& visited[x][y+1] ==false) {
				a.add(1);
				count_a++;
				apartment(x,y+1, N,map);
				a.pop();
			}
			
			if(a.isEmpty()) {
				count_list.add(count_a);
				count_ar[idx] = count_a;
				idx++;
			}
	}

}
