/* Baekjoon 2338
 * ���ڸ� ���
 * ù° �ٿ� A��, ��° �ٿ� B / ������ ���� 10������ 1,000�ڸ��� ���� ������ ����� ������ ��� �־��� �� �ִ�.
 * A+B , A-B , A*B ���
 */
package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class _2338 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		String b = br.readLine();
		BigInteger a_big = new BigInteger(a); //use BigInteger
		BigInteger b_big = new BigInteger(b);
		
		BigInteger plus_result = a_big.add(b_big);	//plus
		System.out.println(plus_result);
		
		BigInteger minus_result = a_big.subtract(b_big);//minus
		System.out.println(minus_result);
		
		BigInteger mul_result = a_big.multiply(b_big); //mul
		System.out.println(mul_result);
		

	}

}
