package stringConcepts;

import java.util.Scanner;

public class StringOperations
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string to print it");
		String c=sc.nextLine();
		System.out.println(c);
		System.out.println("Enter any integer to print it");
		int e=sc.nextInt();
		System.out.println(e);
		String a="MoinakDutta Das CristianoT";
		System.out.println(a);
		System.out.println(a.length());
		System.out.println(a.substring(2));
		System.out.println(a.substring(2,11));
		System.out.println(a.replace("a","b"));
		System.out.println(a.replaceAll("\\s",""));
		String[] b=a.split("\\s");
		System.out.println(b.length);
		System.out.println(a.indexOf('T'));
		System.out.println(a.charAt(5));
	}
}
