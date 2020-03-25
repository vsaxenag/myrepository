package other;

import java.util.Stack;

public class ConvertToBinary {

	public static void main(String[] args) {

		/*
		 * To convert an integer from decimal to binary, repeatedly divide your number n
		 * by 2. The dividend at each step should be the result of the integer division
		 * at each step . The remainder at each step of division is a single digit of
		 * the binary equivalent of n. if you then read each remainder in order from the
		 * last remainder to the first, you have the entire binary number.
		 */

		int n = 10;
		Stack s = new Stack();
		while (n > 0) {

			int mod = n % 2;

			s.push(mod);

			n = n / 2;

		}

		System.out.println(s.toString());

	}

}
