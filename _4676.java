/* SwExpertAcademy 4676	
 * �þ����� �Ҹ� �����
 * '-'�� �̿��Ͽ� �þ����� ���ڿ��� ����� ���
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class _4676 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());
		
		for(int test=1; test<=test_case; test++) {
			LinkedList<Character> l = new LinkedList();
			String str = br.readLine(); //�þ����� �Ҹ��� ����� ���ڿ�
			for(int i=0; i<str.length(); i++) {
				l.add(str.charAt(i));
			}
			int h = Integer.parseInt(br.readLine()); //������ �������� ����
			String posi[] = br.readLine().split(" ");
			for(int i=0; i<h; i++) {
				int p = Integer.parseInt(posi[i]);	//���� ��ġ
				int count = 0;					
				for(int s=0; s<l.size(); s++) {
					if( p == 0 ) {			//�� �տ� ����
						l.addFirst('-');
						break;
					}
					else {
						if(l.get(s) != '-') {
							count++;		//���� ��ġ ã��
						}
						if( count == p ) {
							l.add(s+1 , '-');		
							break;
						}
					}
				}
			}
			/*���*/
			System.out.print("#"+test+" ");
			for(int i=0; i<l.size(); i++) {
				System.out.print(l.get(i));
			}
			System.out.println();
		}
		

	}

}
