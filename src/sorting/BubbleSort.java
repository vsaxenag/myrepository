package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] intArr = {1,5,2,6,8,4,3,6,0,-1};
		
		
		for (int i=0; i<intArr.length-1; i++) {
			
			for(int j=0; j<intArr.length-i-1;j++) {
				
				if(intArr[j] > intArr[j+1]) {
					int temp = intArr[j];
					intArr[j] = intArr[j+1];
					intArr[j+1] = temp;
					
				}
				
			}
			
		}
		System.out.println(Arrays.toString(intArr));

	}

}
