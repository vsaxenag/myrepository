package recurssion;

public class Fibonacci {
	
	//get Fibonacci number at specific position
	public static int fibonacciGenertor(int n){
		
		
		return (fibonacciGenertor(n-1) + fibonacciGenertor(n-2));
				
		
		
	}

	public static void main(String[] args) {
		
		/*  Fibonacci Sequence : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,  */
		fibonacciGenertor(7);

	}

}
