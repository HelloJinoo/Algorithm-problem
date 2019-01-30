/* SwExpertAcademy 1493	
 * ���� ���ο� ����
 * �־��� ���꿡 �ش��ϴ� �� ���
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1493 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());
		
		int start = 1;
		
		Store[] s = new Store[45001];
		s[1] = new Store(1,1,1);
		
		/*������ ��ǥ�� �ش��ϴ� �� ����*/
		for(int i=2; i<=45000; i++) {
			if(s[i-1].y ==1 ) {
				start++;
				s[i]= new Store(i , 1,start);
			}
			else {
				s[i] = new Store(i , s[i-1].x+1 , s[i-1].y-1);
			}
			
		}

		
		for(int test=1; test<=test_case; test++) {
			String input[] = br.readLine().split(" ");
			int p = Integer.parseInt(input[0]);
			int q = Integer.parseInt(input[1]);
		
			Store s1 = s[p];
			Store s2 = s[q];
			int x = s1.x+s2.x;
			int y = s1.y+s2.y;
			int result = 0;
			
			/*���� ��ǥ�� �ش��ϴ� ��  ã��*/
			for(int i=1; i<=s.length-1; i++) {
				if( x == s[i].x && y == s[i].y) {
					result = s[i].n;
				}
			}
			System.out.println("#"+test+" "+result);
			
		}

	}
	
	/*��ǥ�� �ش��ϴ� ��*/
	static public class Store{
		private int n; //�ش� ��
		private int x; //x��ǥ
		private int y; //y��ǥ
		
		public Store(int n , int x, int y) {
			this.n = n;
			this.x = x;
			this.y = y;
		}
	}

}
