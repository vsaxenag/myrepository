package strings;

public class ReverseAStringWithoutInbuiltMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "1234567";
		char[] charA = s.toCharArray();
		System.out.println(charA);
		int length = charA.length;
		
		for(int i=0; i <length/2; i++) {
			char temp = charA[i];
			
			charA[i] = charA[length-i-1];
			charA[length-i-1] = temp;
			
			
		}
		
		System.out.println(charA);

	}

}
