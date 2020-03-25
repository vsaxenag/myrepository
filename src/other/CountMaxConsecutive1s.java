package other;

public class CountMaxConsecutive1s {

	public static void main(String[] args) {

		int[] intArray = { 0,1,1,0,1,1,1,0,1,1,1,1,0,0,0,1 };

		int count = 0;
		int temp = 0;
		for (int i = 0; i < intArray.length; i++) {

			if (intArray[i] == 0) {

				temp = 0;

			} else if (intArray[i] == 1) {
				temp++;
				if (count < temp) {
					count = temp;
				}
			}

		}
		System.out.print(count);

	}

}
