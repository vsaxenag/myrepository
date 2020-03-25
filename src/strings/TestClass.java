package strings;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		int i =0;
		
		
		if(i % 5 == 0 && i%3 == 0 ) {
			System.out.println("FizzFuzz");
		}else if (i % 5 == 0 && !(i%3==0) ) {
			System.out.println("Fuzz");
		}else if (i%3 == 0 && !(i%5==0)){
			System.out.println("Fizz");
			
		}else {
			System.out.println(i);
		}
		

	}

}
