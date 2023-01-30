package collectionConcepts;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapBasicOldExample {

	public static void main(String[] args) {
		//It stores values as key value pair.
		//HashMap is a class which extends abstract Map and implements Map interface.
		//It contains only unique elements.
		//It may have one null key and multiple null values.
		//It maintains no order
		//We use Entry interface to traverse through hashMap.
		//HashMap is non-synchronized (--not thread safe),It means if it is used in multithreading env/concept, more than 1 thread can access and process the hasmap simalteniously. It means 
		/// 	there are multiple threads are running on and then hashmap object can be access by all the threads.So performance of the hashmap will be increased automatically.
		/// 	whenever you have to use fast performance system, in that case we should use hashmap. We don't use hashtable coz that is synchronized.in hashTable at a time, 
		///		only one thread can be access 
		//Biggest problem with HashMap: Fail fast condition: whenever one thred is updating or modifying one value and at the same time thread 2 is also trying to access same object, 
		//that time we will get "concurrent modification exception" which is called as Fast-fail condition.
		
		//Synchronization means, if 1 thread is working on one object, 
		///		other thread will not attack on that object.Once 1st thread will release the object,
		///		then 2nd thread will start using that object. This is called synchronization.
		
		//Non-Synchronization: All the threads will use same object at a time simultaneously. 
		//HashMap is used in multithreading applications where you want to improve the performance.
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Selenium");
		hm.put(2, "QA");
		hm.put(3, "Test");
		hm.put(4, "RFT");
		hm.put(4, "RFT");

		//Fetch values:
		System.out.println(hm.get(1));
		System.out.println(hm.get(4)); //will give null, coz doesnt store value based on index.

		for(Entry<Integer,String> m : hm.entrySet()) {
			System.out.println(m.getKey() +" " + m.getValue());
		}

		//Remove:
		System.out.println(hm);
		hm.remove(3);
		System.out.println(hm);

		HashMap<Integer,Employee> emp= new HashMap<Integer,Employee>();
		Employee e1 = new Employee("Tom",25,"Admin");
		Employee e2 = new Employee("Peter",27,"QA");
		Employee e3 = new Employee("Steve",30,"Dev");

		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);

		//traverse the hashmap:
		for(Entry<Integer, Employee> m: emp.entrySet()) {
			int key=m.getKey();
			Employee e=m.getValue();
			System.out.println("Employee "+key+ " Info:");
			System.out.println(e.name +" "+ e.age + " " +e.dept);
		}
	}
}