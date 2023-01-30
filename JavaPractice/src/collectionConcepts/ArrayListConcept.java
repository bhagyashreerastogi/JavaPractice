package collectionConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		int a[]=new int[3]; //static array --> fixed size 

		// dynamic array ==> ArrayList 
		ArrayList ar= new ArrayList();

		ar.add(10); //0th position
		ar.add(20); //1st position
		ar.add(30); //2nd position

		System.out.println(ar.size());

		ar.add(40); //3
		ar.add(50); //4
		ar.add(60); //5
		ar.add(12.30); //6
		ar.add("Test");//7
		ar.add(true);  //8
		ar.remove(4);

		System.out.println("Latest size of arraylist="+ar.size());
		System.out.println(ar.get(4)); // To get the value from an index

		// To print all the values from ArrayList : 
		// 1. Using For loop 
		// 2. Using iterator
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}

		// Non generic vs generic :
		ArrayList<Integer> ar1= new ArrayList<Integer>();
		ar1.add(100);
		//	 ar1.add("Test");

		ArrayList<String> ar2= new ArrayList<String>();
		ar2.add("Test");
		ar2.add("greeks");
		ar2.add("greeks2");
		//	 ar2.add(100);
		ar2.remove("greeks"); // for removing specific value
		System.out.println("This is ar2 arraylist"+ar2);
		System.out.println("2nd ele of ar2="+ar2.get(1));
		
		ArrayList<String> ar3= new ArrayList<String>();

		// Employee class object
		Employee e1= new Employee("Bhagya",27,"QA");
		Employee e2= new Employee("riya",28,"admin");
		Employee e3= new Employee("Tom",30,"dev");

		// Create arrayList:
		ArrayList<Employee> ar4=new ArrayList<Employee>();
		ar4.add(e1); // we stored object here 
		ar4.add(e2);
		ar4.add(e3);

		// iterator to traverse the values:
		Iterator<Employee> it = ar4.iterator(); // iterator doesn't work on index basis, So can't use for loop. That's y using while loop
		while(it.hasNext()) {

			Employee emp= it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}

		//"************************************
		System.out.println("*********addAll()*******");
		// addAll()

		ArrayList<String> ar5= new ArrayList<String>();
		ar5.add("Test");
		ar5.add("Selenium");
		ar5.add("QTP");

		ArrayList<String> ar6= new ArrayList<String>();
		ar6.add("dev");
		ar6.add("Java");
		ar6.add("Javascript");

		ar5.addAll(ar6); // it will merge two arrayList together

		for(int i=0;i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}

		System.out.println("*********removeAll()********");
		// removeAll():
		ar5.removeAll(ar6);

		for(int i=0;i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}

		//retainAll() --> It is used to check common part of two ArrayList
		ArrayList<String> ar7= new ArrayList<String>();
		ar7.add("Test");
		ar7.add("Selenium");
		ar7.add("QTP");

		ArrayList<String> ar8= new ArrayList<String>();
		ar8.add("Test");
		ar8.add("Java");
		ar8.add("Javascript");

		ar7.retainAll(ar8);
		System.out.println("*********retainAll()********");
		for(int i=0;i<ar7.size();i++) {
			System.out.println(ar7.get(i));
						
			System.out.println(12>>2);
		}
	}
}