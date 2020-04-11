package other;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.print("Hello");
		
		
		
		String input = "Hello World"; 
		  
        // getBytes() method to convert string  
        // into bytes[]. 
        byte [] byteArray = input.getBytes(); 
  
        byte [] output =  
                   new byte [byteArray.length]; 
  
        // Store result in reverse order into the 
        // result byte[] 
        for (int i = 0; i<byteArray.length; i++) 
        	output[i] =  
            		byteArray[byteArray.length-i-1]; 
  
        System.out.println(new String(output)); 
		

	}

	
	
}
