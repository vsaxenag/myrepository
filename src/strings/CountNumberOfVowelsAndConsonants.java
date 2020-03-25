package strings;

public class CountNumberOfVowelsAndConsonants {
	
	public static void main(String[] arg) {
		
		String input = "Hello World";
		input = input.toLowerCase();
		
		int countV =0;
		int countC = 0;
		
		for (int i=0; i< input.length() ; i++) {
			char c = input.charAt(i);
			if( c == 'a'|| c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				countV++;
				
			}else {
				countC++;
			}
		}
		
		System.out.print(countV + " " +  countC);
		
	}

}
