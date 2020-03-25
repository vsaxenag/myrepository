package strings;

public class ConvertLettersIntoNumbers {

	public static void main(String[] args) {
		
		String input = "aBCD";
		
		System.out.println('A'-0);
		System.out.println('a'-0);
		
		for(int i =0; i< input.length(); i++) {
			
			System.out.println(input.charAt(i)+1-'A');
			
			
		}
		
		
		

	}

}
