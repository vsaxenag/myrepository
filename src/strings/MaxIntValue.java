package strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MaxIntValue {

	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<>();
		map.put("a",5);
		map.put("b",2);
		map.put("c",3);
		
		Iterator ints = map.entrySet().iterator();
		int length = map.size();
		
		int[] intArray = new int[length];
		int z = 0;
		int maxValue = 0;
		
		while (ints.hasNext()) {
			Map.Entry me = (Map.Entry)ints.next();
			
			//System.out.println(ints.getValue());
			intArray[z] = (Integer)me.getValue();
			z++;
			
			
			
		}
		 Arrays.sort(intArray);
		 System.out.println(intArray[intArray.length-1]);
		
		

	}

}
