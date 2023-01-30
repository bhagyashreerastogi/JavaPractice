package collectionConcepts;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcepts {

	public static void main(String[] args) {

		//It is similar to HasMap, but it is synchronized.
		//Stores the value on the basis of key-value.
		//key is stored in the form of object--> each Object will have unique HasCode-->value
		//When we create object, java object is defined by some number that number is called HashCode number and it is 32 bit integer number.
		//Hashtable is a class.

		Hashtable h1=new Hashtable();
		h1.put(1, "Tomy");
		h1.put(2, "Pomy");
		h1.put(3, "Java");

		//To create a clone copy/ shallow copy of hashtable
		Hashtable h2=new Hashtable();
		h2=(Hashtable)h1.clone();

		//h2 is replica of h1
		System.out.println("The values from h1 "+h1);
		System.out.println("The values from h2 "+h2);

		//clear hashtable:
		h1.clear();
		System.out.println("The values from h1 "+h1);
		System.out.println("The values from h2 "+h2);

		//contains Value:
		Hashtable st=new Hashtable();
		st.put("A", "Bhagya");
		st.put("B", "Test");
		st.put("C", "Selenium");

		if(st.containsValue("Bhagya")) {
			System.out.println("Value is found");
		}

		//print all the values from hashtable using:
		//Enumeration -- elements()
		Enumeration e= st.elements();

		System.out.println("Print values from st using Enumeration");
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		//get all the values from hashtable using:
		//entrySet() -- set of hashtable values
		System.out.println("Print values from st using entrySet");
		Set s= st.entrySet();
		System.out.println(s);

		Hashtable st1=new Hashtable();
		st1.put("A", "Bhagya");
		st1.put("B", "Test");
		st1.put("C", "Selenium");
		st1.put("C", "Selenium");  //this line will be ignored since it contains only unique values.
		//No null key and null values are allowed.
		st1.put(null, "Testing");  //it will give NullPointerException
		st1.put("D", null);  //it will give NullPointerException

		//check both the hashtables are equal or not:
		if(st.equals(st1)) {
			System.out.println("Both are equal");
		}

		//get the values from a specific key:
		System.out.println(st1.get("A"));

		//get the hashcode of the hashtable object:
		System.out.println("The hashcode value of st1: "+st.hashCode());

		//generics can also be defined:
		Hashtable<String, String> st3=new Hashtable<String, String>();

	}
}