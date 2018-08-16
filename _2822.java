package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2822 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int score[] =new int[9];
		int indexconfirm[] = new int[9];
		int index[] = new int[5];
		for(int i=0; i<8; i++) {
			score[i+1] = Integer.parseInt(br.readLine());
			indexconfirm[i+1] = score[i+1];
		}
		
		int select[] = new int[5];
		Arrays.sort(score);
		int sum=0;
		for(int i=0 ,choose=score.length-1; i<select.length; i++, choose--) {
			select[i] = score[choose];
			sum += score[choose];
		}
		
		System.out.println(sum);
		int a =0;
	for(int j=0; j<select.length; j++) {
		for(int i=1; i<indexconfirm.length; i++) {
			if(select[j] == indexconfirm[i]) {
				index[a] = i;
				a++;
				break;
			}
		}
	}
	Arrays.sort(index);
		for(int i=0; i<index.length; i++) {
		System.out.print(index[i] + " ");
	}
		
	}

}
