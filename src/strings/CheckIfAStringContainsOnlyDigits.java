package strings;

public class CheckIfAStringContainsOnlyDigits {
	
	
	public static void main(String[] args) {
		
		String input = "02565776789";
		
		boolean result = input.matches("[0-9]+");
		
		System.out.println(result);
		
	}
	

}
