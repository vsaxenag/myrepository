package sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] intArr = {1,5,2,6,8,4,3,6,0,-1};
		
		
		for (int i=1; i<intArr.length; i++) {
			
			int j = i-1;
			int key = intArr[i];
			
			while(j>=0 && intArr[j]>key) {
				
				intArr[j+1] = intArr[j];
				j = j-1;
				
			}
			intArr[j+1] = key;
			
				
			
		}
		System.out.println(Arrays.toString(intArr));

	}

}
