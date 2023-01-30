// This class is written on 16 MAY 2022.
// Video #10 - How HashMap works internally || Popular java interview question on HashMap
// Source: https://www.youtube.com/watch?v=SXfsBDTodpY&list=PLFGoYjJG_fqoDQHufg7XVk-yb2w6CNpgF&index=10

package collectionConcepts;

import java.util.HashMap;
import java.util.Map;

public class HashMapWorking {

	public static void main(String[] args) {
		
		Map<String, Integer> marks= new HashMap<String, Integer>();
		marks.put("Bhagya", 100);
		marks.put("Pinky", 101);
		marks.put("Kavya", 102);
		marks.put("Ansh", 103);
		marks.put("Umang", 104);
		marks.put("Siddhi", 105);
		marks.put("Damini", 106);

		marks.put(null, 107);
		marks.put(null, 108);
		
		marks.remove("Pinky");
		
		System.out.println(marks.get("Siddhi"));
		// Check for hashcode of Siddhi -- suppose hashcode is 210678
		// calculate index based on hashcode= suppose it is 5
		// it will go the that index and will use .equals() to check the key name
		// it gets siddhi
		// return value
		
	}
}