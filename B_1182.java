package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1182 {

	static int count=0;
	static int n;
	static int s;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		 n = Integer.parseInt(input[0]); //������ ����
		 s = Integer.parseInt(input[1]); //����s
		
		int[] number = new int[n];
		String str_number[] = br.readLine().split(" "); //���� �Է�
		
		/*�Է� -> ���� */
		for(int i=0; i<str_number.length; i++) {
			number[i] = Integer.parseInt(str_number[i]);
		}
		
		
		compare( 0, 0,number);
		System.out.println(count);
			
			 

	}
	
	static public void compare(int depth , int sum , int[] number) {
		
		
		if(depth == n) {
			if( sum == s) {
				count++;
			}
			return;
		}
		compare(depth+1, sum , number);  //���Ծ��� ���
		compare(depth+1, sum+number[depth], number); //������ ���
		
	}
	

}
