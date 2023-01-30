package stringConcepts;

import java.util.ArrayList;
import java.util.Arrays;

public class StringConcatenation {

	public static void main(String[] args) {

		//+: concatenation operator
		//println : is used to print on the console with a new line
		//print : is just used to print on the console  

		int a=100;
		int b=200;

		String x="Hello";
		String y="World";
		String s="Bhagya hello, how are you. hello good, say hello";

		double c=12.33;
		double d=10.34;

		System.out.println(a+b); //300
		System.out.println(x+y); //HelloWorld
		System.out.println(a+b+x+y); //300HelloWorld
		System.out.println(x+y+a+b); // Execution will happen from left to right. So o/p will be-> HelloWorld100200  left to right
		System.out.println(x+y+(a+b));// o/p -> HelloWorld300
		System.out.println(a+b+x+y+a+x+b+y);//o/p->300HelloWorld100Hello200World
		System.out.println(a+b+x+y+a+b); //300HelloWorld100200
		System.out.println(c+d); //22.67
		System.out.println(x+y+c+d); //HelloWorld12.3310.34
		System.out.print("Hello Selenium");
		System.out.println(", Hello Testing"); //'ln' println in means : line new
		System.out.println("value of a = "+a); 
		System.out.println("The addition of a & b = " +(a+b)); //The addition of a & b = 300

		System.out.println(10 + 20 + "myprog"); //30myprog
		System.out.println("myprog" + 10 + 20); //myprog1020
		System.out.println("myprog" + 10 * 20); //myprog200
		System.out.println(s.contains("hello")); //true

	}
}