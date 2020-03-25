package recurssion;

public class Fibonacci {
	
	
	public static int fibonacciGenertor(int first, int second){
		
		int next = 0;
		
		next = first+ second;
		
		System.out.println(next);
		
		if(first == 0 && second ==00) {
			return 0;
			
		}
		else if(next <150) {
		
			return fibonacciGenertor(second, next);
		}else {
			return next;
		}
		
				
		
		
	}

	public static void main(String[] args) {
		
		/*  Fibonacci Sequence : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,  */
		fibonacciGenertor(1,2);

	}

}
