package strings;

public class SwapNextLetter {

	public static void main(String[] args) {
		String input = "ABCDEFGHIJKL";
		char[] inArray = input.toCharArray();
		
		char[] newArray = new char[inArray.length];
		
		for(int i=0; i < inArray.length ; i=i+2) {
			
			
			
			newArray[i]=inArray[i+1];
			newArray[i+1]=inArray[i];
			
		}
		System.out.println(newArray);
		

	}

}
