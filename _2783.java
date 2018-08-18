package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

import org.omg.Messaging.SyncScopeHelper;

public class _2783 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line[] =br.readLine().split(" ");
		
		
		int seven25X = Integer.parseInt(line[0]);
		int seven25Y = Integer.parseInt(line[1]);
	
		double seven25X_Y = (double)seven25X / seven25Y;
		double seven25_1000 =  Double.parseDouble(String.format("%.2f",seven25X_Y*1000));
		double select =seven25_1000; 
		
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++) {
			line = br.readLine().split(" ");
			int otherX = Integer.parseInt(line[0]);
			int otherY = Integer.parseInt(line[1]);
			
			double otherX_Y = (double)otherX / otherY;
			double other_1000=  Double.parseDouble(String.format("%.2f",otherX_Y*1000))  ;
			
			if( select > other_1000) {
				select = other_1000;
			}
		}
		
		System.out.println(select);

	}

}
