/* Sw Expert Academy 1873
 * 상호의 배틀필드
 * 입력한 Map상황에서 전차들을 조작하는 게임
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
			String direction =""; //현재 방향 저장 변수
			char map[][] = new char[row][col];
			
			/*Map 만들기*/
			for(int i=0; i <row; i++) {
				String map_input = br.readLine();
				for(int k=0; k<map_input.length(); k++) {
					char current_posi = map_input.charAt(k);
					map[i][k] = current_posi;
					
					/*초기 현재위치 찾기*/
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
				case 'S':	//포탈 발사
					int shoot_x = current_x;
					int shoot_y = current_y;
					if( direction.equals("top")) {	//포탄 위로 발사
						while( shoot_x >=0 ) {
							if( map[shoot_x][shoot_y] == '*') { //벽돌이면 부서짐
								map[shoot_x][shoot_y] = '.'; 
								break;
							}
							else if( map[shoot_x][shoot_y] == '#') { //강철벽이면 끝
								break;
							}
							shoot_x--;
						}
					}
					else if( direction.equals("left")) {	//포탈 왼쪽으로 발사
						while( shoot_y >=0 ) {
							if( map[shoot_x][shoot_y] == '*') { //벽돌이면 부서짐
								map[shoot_x][shoot_y] = '.'; 
								break;
							}
							else if( map[shoot_x][shoot_y] == '#') { //강철벽이면 끝
								break;
							}
							shoot_y--;
						}
					}
					else if(direction.equals("right")) {	//포탈 오른쪽으로 발사
						while( shoot_y < map[shoot_x].length ) {
							if( map[shoot_x][shoot_y] == '*') { //벽돌이면 부서짐
								map[shoot_x][shoot_y] = '.'; 
								break;
							}
							else if( map[shoot_x][shoot_y] == '#') { //강철벽이면 끝
								break;
							}
							shoot_y++;
						}
					}
					else if( direction.equals("bottom")) {	//포탈 아래로 발사
						while( shoot_x < map.length ) {
							if( map[shoot_x][shoot_y] == '*') { //벽돌이면 부서짐
								map[shoot_x][shoot_y] = '.'; 
								break;
							}
							else if( map[shoot_x][shoot_y] == '#') { //강철벽이면 끝
								break;
							}
							shoot_x++;
						}
					}
					break;
				case 'U':	//위쪽으로 움직임
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
				case 'D':	//아래쪽으로 움직임
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
				case 'L':	//왼쪽으로 움직임
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
				case 'R':	//오른쪽으로 움직임
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
