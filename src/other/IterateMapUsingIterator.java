package other;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IterateMapUsingIterator {
	
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("India", "Delhi");
		map.put("USA", "Washington DC");
		
		//Set//x
		Set s = map.entrySet();
		
		
		Iterator it = s.iterator();
		
		while(it.hasNext()) {
			Map.Entry<String, String> entry = (Map.Entry)it.next();
			System.out.println(entry);
		}
		
		
		
	}

}
