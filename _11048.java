package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11048 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] range = br.readLine().split(" ");
		int room[][] = new int[Integer.parseInt(range[0])][Integer.parseInt(range[1])]; //캔디가 들어있는 방
		int candy[][] = new int[Integer.parseInt(range[0])][Integer.parseInt(range[1])]; //dp를 이용하기위한 배열
		
		for(int i=0; i <room.length; i++) {
			String candy_count[] = br.readLine().split(" "); //각방의 캔디 수
			for(int j=0; j<candy_count.length; j++) {
				room[i][j] = Integer.parseInt(candy_count[j]);
			}
		}
		candy[0][0] = room[0][0];
		
		for(int row=0; row< room.length; row++) {
			for(int col=0; col<room[row].length; col++) {
				if(row+1 < room.length) {  //아래 방이 있을 경우
					if(candy[row+1][col] < candy[row][col] + room[row+1][col]) {
						candy[row+1][col] = candy[row][col] + room[row+1][col];
					}
				else if( col +1 < room[row].length) { //오른쪽,아래 대각선 방이 있을 경우
					if(candy[row+1][col+1] < candy[row][col] + room[row+1][col+1]) {
						candy[row+1][col+1] = candy[row][col] + room[row+1][col+1];
					}
				  }
				}
				if(col +1 < room[row].length) { //오른쪽 방이 있을 경우
					if( candy[row][col+1] < candy[row][col] + room[row][col+1]) {
						candy[row][col+1] = candy[row][col] + room[row][col+1];
					}
				}
			}	
		}
		System.out.println(candy[candy.length-1][candy[0].length-1]);
	}

}
