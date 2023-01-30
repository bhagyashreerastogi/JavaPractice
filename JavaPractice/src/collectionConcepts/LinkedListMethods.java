package collectionConcepts;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {

		//LinkedList is a class
		LinkedList<String> ll=new LinkedList<String>();
		System.out.println("Size of LL before adding eles= "+ll.size());

		//add:
		ll.add("test"); //0 index
		ll.add("qtp");  //1
		ll.add("Selenium"); //2
		ll.add("RPA");		//3
		ll.add("RFT");		//4
		ll.add("UFT");		//5
		System.out.println("Size of LL after adding eles= "+ll.size());
		
		//print:
		System.out.println("contents of linkedlist: "+ll);

		//add at first place:
		ll.addFirst("Bhagya");
		//add at particular index 
		ll.add(3, "Tony");
		//add at Last place:
		ll.addLast("Rastogi");

		//print: 
		System.out.println("contents of linkedlist: "+ll);

		//how to get values: 
		System.out.println(ll.get(0)); 
		//how to set values:  this will replace value at particular index
		ll.set(0, "Tom"); 
				
		System.out.println("contents of linkedlist: "+ll);

		//remove first element and last element: 
		ll.removeFirst(); ll.removeLast();
		System.out.println("contents of linkedlist: "+ll);

		//remove from specific index: 
		ll.remove(5);
		System.out.println("contents of linkedlist: "+ll);
		
		// other methods:
		// addAll(); removeAll(collection); 
		// remove everything = ll.clear();
		
		//how to print all the values of LinkedList:
		//for loop:
		System.out.println("***Using for loop***");
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}

		//advance for loop: 
		System.out.println("***Using Advance for loop***");
		for(String str: ll) { System.out.println(str); }

		//iterator: 
		System.out.println("***Using iterator***");
		Iterator<String> it=ll.iterator(); 
		while(it.hasNext()) {
			System.out.println(it.next()); 
		}

		//while loop: 
		System.out.println("***Using while loop***");
		int num=0; while(ll.size()>num) {
			System.out.println(ll.get(num)); num++; 
		}
		
		//Reverse the LinkedList:
		System.out.println("****list in reverse order**** ");
		Iterator<String> itr=ll.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Sort list: list Collections class, check sorting algo to understand this method
		Collections.sort(ll);
		System.out.println(ll);
	}
}