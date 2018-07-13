package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2217 {
		 public static void main(String[] args) throws IOException{
		      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		      int N = Integer.parseInt(br.readLine());
		      
		      int []arr = new int[N];
		      
		      for(int i=0; i< arr.length; i++) {
		    	  arr[i] = Integer.parseInt(br.readLine());
		      }
		      br.close();
		      Arrays.sort(arr);
		      int max = arr[arr.length-1];
		      int j=1;
		      for(int i=arr.length-1; i>=0; i--) {
		    		  int compare = arr[i]*j;
		    		  j++;
			    	  if(max < compare) {
			    		 max = compare;
			    	  	}
			    	  
		      }
		       System.out.println(max);
	}

}
