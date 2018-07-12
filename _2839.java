package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2839 {
   public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      br.close();
       
      switch(N%5) {
      case 0:
         System.out.println(N/5);
         break;
      case 1:
      case 3:
         System.out.println(N/5 + 1);
         break;
      case 2:
      case 4:
         if((N == 4) || (N == 7))
            System.out.println("-1");
         else 
            System.out.println(N/5 + 2);
         break;
      }
   }

}