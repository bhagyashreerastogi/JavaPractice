package javaPractise;

import java.util.*;

public class SortingArrayListDescendingOrder {

	public static void SortingArrayListDescendingOrder1() {

		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("Pear");
		arraylist.add("Apple");
		arraylist.add("Banana");
		arraylist.add("Mango");

		/*Unsorted List: ArrayList content before sorting*/
		System.out.println("ArrayList Before Sorting:");
		for(String str: arraylist){
			System.out.println(str);
		}

		/* Sorting in decreasing (descending) order*/
		Collections.sort(arraylist, Collections.reverseOrder());

		/* Sorted List in reverse order*/
		System.out.println("\nArrayList in descending order:");
		for(String str: arraylist){
			System.out.println(str);
		}
	}
}