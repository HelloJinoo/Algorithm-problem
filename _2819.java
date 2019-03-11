import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;


/**
 * @author HelloJinoo
 * Sw 2819 격자판붙이기
 * 서로 다른 7자리 수의 갯수 출력
 */
public class _2819 {
	static int count = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());
		
		for(int test=1; test<=test_case; test++) {
			count =0;
			HashSet list = new HashSet();
			String board[][] = new String[4][4];
			/*격자판에 숫자 넣기*/
			for(int i=0; i<board.length; i++) {
				String input[] = br.readLine().split(" ");
				for(int j=0; j<input.length; j++) {
					board[i][j] = input[j];
				}
			}
			
			for(int i=0; i<board.length; i++) {
				for(int j=0; j<board.length; j++) {
					search(board, i, j, 1 , board[i][j] , list);
				}
			}

			System.out.println("#"+test+" "+list.size());
		
		}

	}
	static public void search(String[][] board ,int row , int col , int maxnum , String line , HashSet hs) {
		
		/*maxnum의 수가 붙어 있을 경우*/
		if(maxnum == 7 ) {
				hs.add(line);
		}
		else {
			/*왼쪽에 갈수 있을 경우*/
			if(col-1 >= 0 ) {
				String n_line = line;
				n_line += board[row][col-1];
				search(board ,row , col-1 , maxnum+1 , n_line,hs);
			}
			/*오른쪽에 갈수 있을 경우*/
			 if( col+1 <board.length ) {
				String n_line = line;
				n_line += board[row][col+1];
				search(board ,row , col+1 , maxnum+1,n_line,hs);
			}
			/*위쪽에 갈수 있을 경우*/
			 if( row-1 >= 0 ) {
				String n_line = line;
				n_line += board[row-1][col];
				search(board ,row-1 , col , maxnum+1,n_line,hs);
			}
			/*밑쪽에 갈수 있을 경우*/
			 if( row+1 < board.length ) {
				String n_line = line;
				n_line += board[row+1][col];
				search(board ,row+1 , col , maxnum+1,n_line,hs);
			}
		}
	}

}
