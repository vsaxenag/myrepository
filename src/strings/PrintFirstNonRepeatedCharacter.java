package strings;

import java.util.HashMap;
import java.util.Map;

public class PrintFirstNonRepeatedCharacter {

	public static void main(String[] args) {
		
		String input = "zanzibar";
		char[] charArray = input.toCharArray();
		
		
		
		char n = '-';
		
		
		for(int j = 0;j<charArray.length; j++ ) {
			boolean found = true;
			n = charArray[j];
			
			for(int i=0; i< charArray.length; i++) {
				
				if((n == charArray[i]) && i != j) {
					found = false;
					break;
				}
					
				
				
			}
			
			if(found) {
				System.out.println(n);
				break;
				
			}
			
			
		}
		
		
		
		
			
		
		

	}

}
