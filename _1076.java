package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class _1076 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String result="";
		HashMap<String, String> value = new HashMap();
		value.put("black", "0");
		value.put("brown", "1");
		value.put("red", "2");
		value.put("orange", "3");
		value.put("yellow", "4");
		value.put("green", "5");
		value.put("blue", "6");
		value.put("violet", "7");
		value.put("grey", "8");
		value.put("white", "9");
		
		HashMap<String, String> mul = new HashMap();
		mul.put("black", "");
		mul.put("brown", "0");
		mul.put("red", "00");
		mul.put("orange", "000");
		mul.put("yellow", "0000");
		mul.put("green", "00000");
		mul.put("blue", "000000");
		mul.put("violet", "0000000");
		mul.put("grey", "00000000");
		mul.put("white", "000000000");
		
		String color = br.readLine();
		if(!color.equals("black")) {
			result +=value.get(color);
		}
		
		 color = br.readLine();
		 result +=value.get(color);
		
		
		 color = br.readLine();
		 if( result.equals("0")) {
			 System.out.println(result);
		 }
		 else {
			 result +=mul.get(color);
			 System.out.println(result);
		 }
		 
		 
	}

}
