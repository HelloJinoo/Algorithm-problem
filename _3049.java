package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3049 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int count = n*(n-1)*(n-2)*(n-3)/24;  //n���� �ٰ��� �� �ƹ� 4���� �������� �����Ͽ� �簢���� ����� ������1�� 
		System.out.println(count);           //n���� ���������� ����� �ִ� �簢���� ��

	}

}
