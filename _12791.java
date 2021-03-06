package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class _12791 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		HashMap<Integer,String> map = new HashMap();
		
		map.put(1967,"DavidBowie");
		map.put(1969,"SpaceOddity");
		map.put(1970,"TheManWhoSoldTheWorld");
		map.put(1971,"HunkyDory");
		map.put(1972,"TheRiseAndFallOfZiggyStardustAndTheSpidersFromMars");
		map.put(1973,"AladdinSane,PinUps");
		map.put(1974,"DiamondDogs");
		map.put(1975,"YoungAmericans");
		map.put(1976,"StationToStation");
		map.put(1977,"Low,Heroes");
		map.put(1979,"Lodger");
		map.put(1980,"ScaryMonstersAndSuperCreeps");
		map.put(1983,"LetsDance");
		map.put(1984,"Tonight");
		map.put(1987,"NeverLetMeDown");
		map.put(1993,"BlackTieWhiteNoise");
		map.put(1995,"1.Outside");
		map.put(1997,"Earthling");
		map.put(1999,"Hours");
		map.put(2002,"Heathen");
		map.put(2003,"Reality");
		map.put(2013,"TheNextDay");
		map.put(2016,"BlackStar");
		
		for(int i=0; i<N; i++) {
			String line[] =br.readLine().split(" ");
			int S = Integer.parseInt(line[0]);
			int E = Integer.parseInt(line[1]);
			int count=0;
			for(int year=S; year<=E; year++) {
				if(map.containsKey(year)) {
					String sp[] = map.get(year).split(",");
					count += sp.length;
					
				}
			}
			System.out.println(count);
			
				for(int year=S; year<=E; year++) {
					if(map.containsKey(year)) {
						String sp[] = map.get(year).split(",");
						if(sp.length ==1) {
							System.out.println(year+" "+sp[0]);
						}
						else {
							for(int k=0; k<sp.length; k++) {
								System.out.println(year+" "+sp[k]);
							}
						}
					
				}
			}
		}
	}
}
