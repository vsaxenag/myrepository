package recurssion;

public class Factorial {
	
	
	public static int calculateFactorial(int number) {
		
		int factorial = 1;
		System.out.println(number);
		if(number >1) {
			factorial= number*calculateFactorial(number-1);
		}
		return factorial;
		
	}
	

	public static void main(String[] args) {
		
		
		System.out.println("factorial: "+ calculateFactorial(5));
		
		
	}

}
