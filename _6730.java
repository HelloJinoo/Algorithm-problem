/* Sw Expert Academy 6730
 * ��ֹ� ���� ���̵�
 * �ö� �� ���� ���� ���� ��ȭ�� ������ �� ���� ���� ���� ��ȭ ���
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _6730 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());

		for(int t=1; t<=test_case; t++) {
			int block_count = Integer.parseInt(br.readLine());
			String height[] = br.readLine().split(" ");
			int height_descending =0;  //�������� ����
			int height_ascending =0;	//�ö󰡴� ����
			
			for(int i=0; i<block_count-1; i++) {
				int left_height = Integer.parseInt(height[i]);  //���� ��ֹ� ����
				int right_height = Integer.parseInt(height[i+1]); //������ ��ֹ� ����
				if( left_height - right_height > 0) { //�������� ���
					if( left_height - right_height > height_descending ) {
						height_descending =  left_height - right_height;
					}
				}
				else {		//�ö󰡴� ���
					if(  Math.abs(left_height - right_height) > height_ascending) {
						height_ascending = right_height-left_height;
					}
				}
				
			}
			
			System.out.println("#"+t+" "+height_ascending+" "+height_descending);
			
			
			
		}
	}

}
