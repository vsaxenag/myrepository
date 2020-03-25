package strings;

import java.nio.charset.StandardCharsets;

public class ConvertByteArrayToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "HelloWorld";
		
		byte[] bytes = s.getBytes();
		
		System.out.println(bytes.toString());
		
		String newString = new String(bytes, StandardCharsets.UTF_8);
		
		
		System.out.println(newString);
		
	}

}
