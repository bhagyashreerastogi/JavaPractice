package javaBasics;

public class LoopsConcept {

	public static void main(String[] args) {

		//1. while loop:
		//while is a keyword
		//disadvantage of while loop: it will generate infinite loop if you don't give incremental/decremental part.

		System.out.println("********While Loop********");
		//print 1 to 10
		int i=1;      //initialization 
		while(i<=10){ //conditional
			System.out.println(i);
			i++;      //incremental/decremental 
		}

		//2. for loop:
		//for is also a keyword

		System.out.println("********For Loop********");
		//print 1 to 10
		for(int j=1;j<=10;j++){ //initialization;conditional;incremental
			System.out.println(j);
		}

		System.out.println("============");
		//print 10 to -10
		for(int k=10;k>=-10;k--){ //initialization;conditional;decremental 
			System.out.println(k);
		}
	}
}
