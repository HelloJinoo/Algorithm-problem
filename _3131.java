/* SwExpertAcademy 3131	
 * 100만 이하의 모든 소수
 * 에라토스테네스의 채
 */

public class _3131 {

	public static void main(String[] args) {
	
		boolean num[] = new boolean[1000001];  //소수 확인을 위한 배열
		
		/*소수 확인*/
		for(int i=2; i<Math.sqrt(num.length); i++) {
			int j= 2;
			while( i * j  < num.length) {
				num[i*j] = true;	//소수가 아니면 true
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
