package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class B_11724 {

	static int parent[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		LinkedList l = new LinkedList();
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		parent = new int[n+1];	//�θ�迭
		
		/*�θ�迭 �ʱ�ȭ*/
		for(int i=0; i<parent.length; i++) {
			parent[i] = i;
		}
		
		for(int line=0; line<m; line++) {
			input = br.readLine().split(" ");
			int v1 = Integer.parseInt(input[0]);
			int v2 = Integer.parseInt(input[1]);
			Union(v1, v2);
		}
		
		/*���� ���� �ľ�*/
		for(int i=1; i<parent.length; i++) {
			if(!l.contains(parent[i])) {
				l.add(parent[i]);
			}
		}
		
		System.out.println(l.size());

			
	}
	
	
	static public void Union(int x, int y){
		x = Find(x);
		y = Find(y);
		if( x!=y ){
			/*���ο� �θ�� �ٲ��ֱ�*/
			for(int i=1; i<parent.length; i++) {
				if( parent[i] == y ) {	
					parent[i] = x;
				}
			}
			
		}
	}
	
	
	/*Root ã��*/
	static public int Find(int x){

		//�θ� �ڱ��ڽ��� ���
		if(x == parent[x]){
			return x;
		}
		else{
			/*�ٸ� �θ� ã��*/
			int y = Find(parent[x]);
			parent[x] = y;
			return y;
		}

	}

}
