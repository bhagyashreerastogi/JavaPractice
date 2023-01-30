package collectionConcepts;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("A", "sunday");
		hm.put("B", "Monday");
		hm.put("C", "Tuesday");
		hm.put("D", "Wednesday");
		hm.put("E", "Thursday");

		System.out.println(hm);

		//how to fetch values from HashMap:
		String value=hm.get("D");
		System.out.println("Values from Mapis : "+value);

		for(Map.Entry<String,String> data: hm.entrySet()) {
			System.out.println("key from map is "+data.getKey() + " and Value is: "+data.getValue());
		}


	}

}
