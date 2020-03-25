package strings;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersFromAString {
	
	
	
	
	public static void main(String[] args) {
		
		String input = "AAAABDDCDEF";
		
		char[] cArray = input.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		 
		for(char c : cArray) {
			
			System.out.print(c);
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
			
		}
		
		System.out.print(map);
		
	}
	
	
	
	
	
	
	
	

}
