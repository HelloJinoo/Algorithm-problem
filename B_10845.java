import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class B_10845 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		LinkedList q = new LinkedList();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int test=0; test<T; test++) {
			String input[] = br.readLine().split(" ");
			
			if(input[0].equals("push")) {
				q.add(input[1]);
			}
			else if(input[0].equals("front")) {
				if(!q.isEmpty()) {
					System.out.println(q.getFirst());
				}
				else {
					System.out.println("-1");
				}
			}
			else if(input[0].equals("back")) {
				if(!q.isEmpty()) {
					System.out.println(q.getLast());
				}
				else {
					System.out.println("-1");
				}
			}
			else if(input[0].equals("size")) {
				System.out.println(q.size());
			}
			else if(input[0].equals("pop")) {
				if(!q.isEmpty()) {
					System.out.println(q.getFirst());
					q.remove(0);
				}
				else {
					System.out.println("-1");
				}
			}
			else if(input[0].equals("empty")) {
				if(!q.isEmpty()) {
					System.out.println("0");
				}
				else {
					System.out.println("1");
				}
			}
		}

	}

}
