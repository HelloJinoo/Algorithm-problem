/* SwExpertAcademy 3131	
 * 100�� ������ ��� �Ҽ�
 * �����佺�׳׽��� ä
 */

public class _3131 {

	public static void main(String[] args) {
	
		boolean num[] = new boolean[1000001];  //�Ҽ� Ȯ���� ���� �迭
		
		/*�Ҽ� Ȯ��*/
		for(int i=2; i<Math.sqrt(num.length); i++) {
			int j= 2;
			while( i * j  < num.length) {
				num[i*j] = true;	//�Ҽ��� �ƴϸ� true
				j++;
			}
		}
		
		for(int i=2; i<num.length; i++) {
			if(num[i] == false) {
				System.out.print(i+" ");
			}
		}

	}

}
