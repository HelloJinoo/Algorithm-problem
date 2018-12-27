package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3049 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int count = n*(n-1)*(n-2)*(n-3)/24;  //n개의 다각형 중 아무 4개의 꼭짓점을 선택하여 사각형을 만들면 교차점1개 
		System.out.println(count);           //n개의 꼭짓점으로 만들수 있는 사각형의 수

	}

}
