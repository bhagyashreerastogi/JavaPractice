// This class is written on 16 MAY 2022.
// Video #8: What is HashMap? How to iterate HashMap?
// Source: https://www.youtube.com/watch?v=MQtigRHn7WU&list=PLFGoYjJG_fqoDQHufg7XVk-yb2w6CNpgF&index=8
package collectionConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {

		HashMap<String, String> capitalMap = new HashMap<String, String>();
		capitalMap.put("India", "Delhi");
		capitalMap.put("USA", "Washington DC");
		capitalMap.put("UK", "London");
	//	capitalMap.put("UK", "London11"); // since it can't have duplicate values, It will overriden and return London11.
		capitalMap.put(null, "Berlin");
		capitalMap.put(null, "LA"); // Since it can have only one null key, it will return latest value.
		capitalMap.put("Russia", null);
		capitalMap.put("France", null);
		capitalMap.remove("France"); // remove
		// replace methods
		
		System.out.println(capitalMap.get("USA"));
		System.out.println(capitalMap.get("Germany")); // since Germany is wrong key, it will print null.
		System.out.println(capitalMap.get(null));
		System.out.println(capitalMap.get("France"));
		System.out.println("Initial list of elements: "+capitalMap);  
		
		System.out.println("*******************************");
		//iterator: over the keys: by using keySet() 
		Iterator<String> it = capitalMap.keySet().iterator();
		while(it.hasNext()) {
			String key=it.next();
			String value = capitalMap.get(key);
			System.out.println("key = " +key+ ", value = " +value );
		}
		
		System.out.println("*******************************");
		//iterator: over the set (pair): by using entrySet
		Iterator<Entry<String,String>> itr=capitalMap.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<String,String> entry=itr.next();
			System.out.println("Key = "+entry.getKey()+ " | value = "+entry.getValue());
		}
		
		System.out.println("*******************************");
		// Using for loop and Map.Entry interface 
		for(Map.Entry<String,String> m : capitalMap.entrySet()){    
		    System.out.println("Key = "+m.getKey()+" & value = "+m.getValue());    
		   }  
		
		System.out.println("*******************************");
		//iterate hashmap using java 8 forEach and lambda;
		capitalMap.forEach((k,v) -> System.out.println("key = "+k+" and value = "+v));
	}
}