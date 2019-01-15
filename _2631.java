/* Baekjoon 2631
 * 줄세우기
 * 번호 순서대로 줄을 세우기 위해서 아이들의 위치를 옮기려고 한다. 
 * 그리고 아이들이 혼란스러워하지 않도록 하기 위해 위치를 옮기는 아이들의 수를 최소
 */
package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2631 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int child_count = Integer.parseInt(br.readLine()); //아이의 수
		int[] posi = new int[child_count];
		int[] greater = new int[child_count];  //자신보다 작은 증가하는 수가 몇개있는지 저장하는 배열
		
		for(int i=0; i<posi.length; i++) {
			posi[i] = Integer.parseInt(br.readLine()); //이동하기전 아이들의 위치
			greater[i] = 1;	//greater배열 초기화
		}
		int max = 0;
		for(int i=1; i<posi.length; i++) {
			for(int j=i-1; j>=0; j--) {
				if(posi[j] < posi[i] && greater[i] < greater[j]+1) {  //자신보다 작은 수 나열의 갯수 확인
					greater[i] = greater[j]+1;
				}
				if( greater[i] > max ) {
					max = greater[i];
				}
			}
		}
		System.out.println(posi.length-max);
	}
}
