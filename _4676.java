/* SwExpertAcademy 4676	
 * 늘어지는 소리 만들기
 * '-'를 이용하여 늘어지는 문자열을 만들어 출력
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
			String str = br.readLine(); //늘어지는 소리를 만드는 문자열
			for(int i=0; i<str.length(); i++) {
				l.add(str.charAt(i));
			}
			int h = Integer.parseInt(br.readLine()); //삽입할 하이폰의 갯수
			String posi[] = br.readLine().split(" ");
			for(int i=0; i<h; i++) {
				int p = Integer.parseInt(posi[i]);	//넣을 위치
				int count = 0;					
				for(int s=0; s<l.size(); s++) {
					if( p == 0 ) {			//맨 앞에 삽입
						l.addFirst('-');
						break;
					}
					else {
						if(l.get(s) != '-') {
							count++;		//넣을 위치 찾기
						}
						if( count == p ) {
							l.add(s+1 , '-');		
							break;
						}
					}
				}
			}
			/*출력*/
			System.out.print("#"+test+" ");
			for(int i=0; i<l.size(); i++) {
				System.out.print(l.get(i));
			}
			System.out.println();
		}
		

	}

}
