package javaBasics;

public class DataTypes {

	//main() method--> starting/execution point of program
	public static void main(String[] args) {

		//DataType: means how exactly you are representing your data.
		//What type of data is.

		// premitive data types: int, double, char, boolean

		//1. int:
		int i=10; // Initializing i 
		i=20; // replacing i value
		System.out.println("Value of i = "+i);
		int j=-2;
		System.out.println("Value of j = "+j);
//		int g=0;

		//2.double:
		double d=21.33;
		System.out.println(d);
		double d1=23; //23.00
		System.out.println(d+d1);

		//3. char: only single digit value,should be written within single quotes''.
		char c='@';
		System.out.println(c);
//		char C1='a';
//		char c3='1'; 

		//4. boolean: 
		boolean b1=true;
		boolean b2=false;
		System.out.println(b1 +" & "+b2);

		//5. String: It is a class, not a data type. 
		// But we can use Sting as data type also.
		// String should be written within " ".
//		String s="Hello";
		String s1="Selenium is automation tool";
//		String s2="1000";
		System.out.println(s1);

	}
}