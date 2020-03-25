package strings;

import java.util.Arrays;

public class SwapWords {
	
	public static void main(String[] args) {
		String input = "A B C";
		
			
		String[] inArray = input.split(" ");
		
		
		
		String[] newArray = new String[inArray.length];
		
		for(int i=0; i < inArray.length ; i=i+2) {
			
			if(i < inArray.length-1) {
				newArray[i]=inArray[i+1];
				newArray[i+1]=inArray[i];
				
			}else {
				newArray[i]=inArray[inArray.length-1];
				
				
			}
			
			
			
		}
		
		String s = Arrays.toString(newArray);
		
		System.out.println(s);
		

}
}
