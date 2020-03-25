package other;

import java.util.Map;
import java.util.HashMap;

public class IterateMapUsingForEach {

	public static void main(String[] args) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('a', (int)'a');
		map.put('b', (int)'b');
		map.put('c', (int)'c');
		map.put('d', (int)'d');
		map.put('e', (int)'e');
		
		map.forEach((k,v) ->{
			System.out.println("Item : " + k + " Count : " + v);
		});
				

	}

}
