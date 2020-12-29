package strings;

import java.util.HashMap;
import java.util.Map;

public class CheckIfStringCharsAreUnique {

	public static void main(String[] args) {
		
		String input = "aba";
		
		char[] charArray = input.toCharArray();
		
		approach2(charArray);
		
	

	}
	public static void approach2(char[] charArray) {
		
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		boolean isUnique = true;
		for(char c : charArray) {
			
			if(m.get(c) != null) {
				
				System.out.println("NOT Unique");;
				isUnique = false;
				break;
			}else {
				m.put(c, 1);
			}
			
		}
		if(isUnique) {
		System.out.println("Unique");;
		}
		
	}
	
	
}
