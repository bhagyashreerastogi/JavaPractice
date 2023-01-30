package javaPractise2;

import java.util.Scanner;

public class String2
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string to print it");
		String a=sc.nextLine();
		System.out.println("Given string is: "+a);
		String d="Good evening Siva";
		System.out.println("Another String is:"+d);
		System.out.println("Enter any integer to print it");
		int c=sc.nextInt();
		System.out.println("Given number is : "+c);
		System.out.println(a);
		System.out.println(a.length()); // it will give length of string including spaces
		System.out.println(a.substring(4));  // it will remove 4 char from starting
		System.out.println(a.substring(2,11)); // it will remove 2 char from starting and all char after 11th char(from 12th char till end)
		System.out.println(a.replace("a","b")); // it will replace "a" with "b" in whole string
		System.out.println(a.replaceAll("\\s","")); // it will print complete string without spaces
		System.out.println(a.compareTo(d));  //
		System.out.println(a.isEmpty()); 
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		String[] b=a.split("\\s"); 
		System.out.println("value of b[0] is: " +b[0]);
		System.out.println("value of b[1] is: " +b[1]);
		System.out.println("value of b[2] is: " +b[2]);
//		System.out.println("value of b[3] is: " +b[3]); // error: java.lang.ArrayIndexOutOfBoundsException: 3
		System.out.println(b.length);
		System.out.println(a.indexOf('T'));
		System.out.println(a.charAt(5));
		String s1="hello";
		s1.concat("how are you");
		System.out.println(s1); // o/p --> hello
		s1=s1.concat("how are you");
		System.out.println(s1); // o/p--> hellohow are you
		System.out.println(a.contains("hello"));        
		System.out.println(a.contains("Bhagya"));
		
	}
}
