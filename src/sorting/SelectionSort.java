package sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] intArr = {0,-5,1,5,2,6,8,4,3,6,0,-1};
		
		
		
		for (int i=0; i<intArr.length -1 ; i++) {
			
			int minIndex = i;
			
			for(int j = i+1; j<= intArr.length-1; j++) {
				
				if(intArr[j] < intArr[minIndex]) {
					minIndex = j;
				}
			}
			
			int temp = intArr[i];
			intArr[i] = intArr[minIndex];
			intArr[minIndex] = temp;
			
		}
		
		System.out.println(Arrays.toString(intArr));
		

	}

}
