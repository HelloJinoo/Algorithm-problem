/* Sw Expert Academy 1873
 * ��ȣ�� ��Ʋ�ʵ�
 * �Է��� Map��Ȳ���� �������� �����ϴ� ����
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1873 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());
		
		for(int test=1; test<=test_case; test++) {
			String mapinfo[] = br.readLine().split(" ");
			int row = Integer.parseInt(mapinfo[0]);  
			int col = Integer.parseInt(mapinfo[1]);
			int current_x = 0;
			int current_y = 0;
			String direction =""; //���� ���� ���� ����
			char map[][] = new char[row][col];
			
			/*Map �����*/
			for(int i=0; i <row; i++) {
				String map_input = br.readLine();
				for(int k=0; k<map_input.length(); k++) {
					char current_posi = map_input.charAt(k);
					map[i][k] = current_posi;
					
					/*�ʱ� ������ġ ã��*/
					if(current_posi == '<') {
						current_x = i;
						current_y = k;
						direction = "left";
					}
					else if( current_posi == '>' ) {
						current_x = i;
						current_y = k;
						direction ="right";
					}
					else if(current_posi == 'v') {
						current_x = i;
						current_y = k;
						direction = "bottom";
					}
					else if(current_posi == '^') {
						current_x = i;
						current_y = k;
						direction = "top";
					}
				}
			}
			
			int n = Integer.parseInt(br.readLine());
			String use = br.readLine();
			
			for(int i=0; i<use.length(); i++) {
				char motion = use.charAt(i);
				switch (motion) {
				case 'S':	//��Ż �߻�
					int shoot_x = current_x;
					int shoot_y = current_y;
					if( direction.equals("top")) {	//��ź ���� �߻�
						while( shoot_x >=0 ) {
							if( map[shoot_x][shoot_y] == '*') { //�����̸� �μ���
								map[shoot_x][shoot_y] = '.'; 
								break;
							}
							else if( map[shoot_x][shoot_y] == '#') { //��ö���̸� ��
								break;
							}
							shoot_x--;
						}
					}
					else if( direction.equals("left")) {	//��Ż �������� �߻�
						while( shoot_y >=0 ) {
							if( map[shoot_x][shoot_y] == '*') { //�����̸� �μ���
								map[shoot_x][shoot_y] = '.'; 
								break;
							}
							else if( map[shoot_x][shoot_y] == '#') { //��ö���̸� ��
								break;
							}
							shoot_y--;
						}
					}
					else if(direction.equals("right")) {	//��Ż ���������� �߻�
						while( shoot_y < map[shoot_x].length ) {
							if( map[shoot_x][shoot_y] == '*') { //�����̸� �μ���
								map[shoot_x][shoot_y] = '.'; 
								break;
							}
							else if( map[shoot_x][shoot_y] == '#') { //��ö���̸� ��
								break;
							}
							shoot_y++;
						}
					}
					else if( direction.equals("bottom")) {	//��Ż �Ʒ��� �߻�
						while( shoot_x < map.length ) {
							if( map[shoot_x][shoot_y] == '*') { //�����̸� �μ���
								map[shoot_x][shoot_y] = '.'; 
								break;
							}
							else if( map[shoot_x][shoot_y] == '#') { //��ö���̸� ��
								break;
							}
							shoot_x++;
						}
					}
					break;
				case 'U':	//�������� ������
					direction = "top";
					map[current_x][current_y] = '^';
					if(current_x-1>=0) {
						if(map[current_x-1][current_y] == '.' ) {
							map[current_x-1][current_y] = '^';
							map[current_x][current_y]='.';
							current_x -=1;
						}
					}
					break;
				case 'D':	//�Ʒ������� ������
					direction = "bottom";
					map[current_x][current_y] = 'v';
					if(current_x+1 < map.length) {
						if(map[current_x+1][current_y] == '.' ) {
							map[current_x+1][current_y] = 'v';
							map[current_x][current_y]='.';
							current_x +=1;
						}
					}
					break;
				case 'L':	//�������� ������
					direction = "left";
					map[current_x][current_y] = '<';
					if(current_y-1 >=0) {	
						if(map[current_x][current_y-1] == '.' ) {
							map[current_x][current_y-1] = '<';
							map[current_x][current_y]='.';
							current_y -=1;
						}
					}
					break;
				case 'R':	//���������� ������
					direction = "right";
					map[current_x][current_y] = '>';
					if(current_y+1 < map[0].length) {	
						if(map[current_x][current_y+1] == '.' ) {
							map[current_x][current_y+1] = '>';
							map[current_x][current_y]='.';
							current_y +=1;
						}
					}
					break;
				default:
					break;
				}
			}
			
			System.out.print("#"+test+" ");
			for(int i=0; i<map.length; i++) {
				for(int j=0; j<map[i].length; j++) {
					System.out.print(map[i][j]);
				}
				System.out.println();
			}
		}
	}

}
