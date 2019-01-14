package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11048 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] range = br.readLine().split(" ");
		int room[][] = new int[Integer.parseInt(range[0])][Integer.parseInt(range[1])]; //ĵ�� ����ִ� ��
		int candy[][] = new int[Integer.parseInt(range[0])][Integer.parseInt(range[1])]; //dp�� �̿��ϱ����� �迭
		
		for(int i=0; i <room.length; i++) {
			String candy_count[] = br.readLine().split(" "); //������ ĵ�� ��
			for(int j=0; j<candy_count.length; j++) {
				room[i][j] = Integer.parseInt(candy_count[j]);
			}
		}
		candy[0][0] = room[0][0];
		
		for(int row=0; row< room.length; row++) {
			for(int col=0; col<room[row].length; col++) {
				if(row+1 < room.length) {  //�Ʒ� ���� ���� ���
					if(candy[row+1][col] < candy[row][col] + room[row+1][col]) {
						candy[row+1][col] = candy[row][col] + room[row+1][col];
					}
				else if( col +1 < room[row].length) { //������,�Ʒ� �밢�� ���� ���� ���
					if(candy[row+1][col+1] < candy[row][col] + room[row+1][col+1]) {
						candy[row+1][col+1] = candy[row][col] + room[row+1][col+1];
					}
				  }
				}
				if(col +1 < room[row].length) { //������ ���� ���� ���
					if( candy[row][col+1] < candy[row][col] + room[row][col+1]) {
						candy[row][col+1] = candy[row][col] + room[row][col+1];
					}
				}
			}	
		}
		System.out.println(candy[candy.length-1][candy[0].length-1]);
	}

}
