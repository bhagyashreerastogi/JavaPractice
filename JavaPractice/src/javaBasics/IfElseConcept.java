package javaBasics;

public class IfElseConcept {

	public static void main(String[] args) {

		int a=30;
		int b=20;

		if(b>a){
			System.out.println("b is greater than b");
		}else {
			System.out.println("a is greater than b");
		}

		//comparison operators: 
		//< > <= >= == !=

		int c=50;
		int d=40;

		if(c==d)		{
			System.out.println("c and d are equal");
		}else {
			System.out.println("c and d are not equal");
		}

		//write a logic to find out highest no
		int a1=400;
		int b1=500;
		int c1=300;

		// use nested if-else
		if(a1>b1 & a1>c1){ // false & true = false
			System.out.println("a1 is greatest");
		}else if(b1>c1){
			System.out.println("b1 is greatest");
		}else {
			System.out.println("c1 is greatest");
		}
	}
}