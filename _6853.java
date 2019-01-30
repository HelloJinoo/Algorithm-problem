/* SwExpertAcademy 6853	
 * ���簢���� ��
 * ���簢�� ����, ���� , �ܺο� �ִ� ���� ���� ���
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _6853 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());

		for(int test=1; test<=test_case; test++) {
			String input[] = br.readLine().split(" ");
			Posi p[] = new Posi[4];
			int x1 = Integer.parseInt(input[0]);
			int y1 = Integer.parseInt(input[1]);
			int x2 = Integer.parseInt(input[2]);
			int y2 = Integer.parseInt(input[3]);
			
			p[0] = new Posi(x1,y1);  //���� �Ʒ�
			p[1] = new Posi(x1,y2);	 //���� ��
			p[2] = new Posi(x2,y2);  //������ ��
			p[3] = new Posi(x2,y1);  //������ �Ʒ�
			
			int inner = 0;
			int line = 0;
			int out = 0;
			
			int n = Integer.parseInt(br.readLine());
			for(int i=0; i<n; i++) {
				input = br.readLine().split(" ");
				int x = Integer.parseInt(input[0]);
				int y = Integer.parseInt(input[1]);
			
				/*���簢�� ���� ���� ����*/
				if( (p[0].x == x || p[3].x ==x ) && p[0].y<=y && y <= p[1].y ) {
					line++;
				}
				else if( (y == p[0].y || y ==p[1].y ) && p[0].x <= x && x<=p[3].x ) {
					line++;
				}
				/*���簢�� ���ο� ���� ����*/
				else if(p[0].x < x && x < p[3].x && p[0].y< y && y < p[1].y){
					inner++;
				}
				/*���簢�� �ܺο� �ִ� �� */
				else {
					out++;
				}
			
				
			}
			System.out.println("#"+test+" "+inner+" "+ line+" "+out);
			
			
		}
	}
	
	static public class Posi{
		private int x;
		private int y;
		
		public Posi(int x, int y) {
			this.x= x;
			this.y = y;
		}
		
	}

}
