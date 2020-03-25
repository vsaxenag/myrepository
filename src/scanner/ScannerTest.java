package scanner;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		String test = s.next();
		
		System.out.println(test);
		
		 test = s.next();
		System.out.println(test);
		
		s.close();
		
		

	}

}
