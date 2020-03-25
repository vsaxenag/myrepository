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
	
	public static void approach1(char[] charArray) {
		
		boolean isUnique = true;
		for(int i=0;i<charArray.length; i++) {
			
			System.out.println(charArray[i]);
			
			for(int j=i+1; j<charArray.length; j++) {
				
				System.out.println(charArray[j]);
				if(charArray[j] ==  charArray[i]) {
					
					System.out.println("Not Unique");
					isUnique = false;
					break;
					
				}
				
			}
			
			if(!isUnique) {
				break;
			}
			System.out.println("*******");
			
		}
		
		if(isUnique) {
			System.out.println("Yes Unique");;
		}
		
		
	}

}
