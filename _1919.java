package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1919 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word1 = br.readLine();
		String word2 = br.readLine();
		int word1_count[] = new int[26];
		int word2_count[] = new int[26];

		for(int i=0; i<word1.length(); i++) {
			word1_count[word1.charAt(i)-97]++;
		}

		for(int i=0; i<word2.length(); i++) {
			word2_count[word2.charAt(i)-97]++;
		}
		
		int remove_count=0;
		for(int i=0; i<26; i++) {
			 if( word1_count[i] < word2_count[i] ) {
				remove_count +=  (word2_count[i]-word1_count[i]);
			}
			else if( word1_count[i] > word2_count[i]) {
				remove_count +=  (word1_count[i]-word2_count[i]);
			}
		}
		System.out.println(remove_count);
	}

}
