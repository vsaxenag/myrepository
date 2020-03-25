package strings;

public class CheckPalindromeString {
	
	public static boolean checkPalindrome(String input) {
		
		boolean isPalindrome = true;
		
		if(input == null) {
			return false;
		}
		
		int length = input.length();
		
		if(length == 0) {
			return false;
		}else if (length == 1) {
			return true;
		}
		
		int count = 0;
		while(count <length/2) {
			
			System.out.println(input.charAt(count));
			System.out.println(input.charAt(length-1-count));
			if(input.charAt(count) != input.charAt(length-1-count)) {
				return false;
			}
			
			count ++;
		}
		
		
		return isPalindrome;
	}

	public static void main(String[] args) {
		
		System.out.println(checkPalindrome("civ1ic"));

	}

}
