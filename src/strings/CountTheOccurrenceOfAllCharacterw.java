package strings;

import java.util.HashMap;
import java.util.Map;

public class CountTheOccurrenceOfAllCharacterw {

	public static void main(String[] args) {
		
		char[] charArray = {'a','a','a','c','c','b'};
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char c : charArray) {
			
			if(map.containsKey(c)) {
				map.put(c, (Integer)map.get(c)+1);
			}else {
				map.put(c, 1);
				
			}
			
		}
		System.out.print(map);
		

	}

}
