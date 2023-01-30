package OOPConcepts_Part1;

public class LocalVsGlobalVariables {

	//Global variables or class variables 
	//To access global variable, we can access through object.
	String name="Tom";
	int age=25;

	public static void main(String[] args) {

		int i=10; //Local variable of main method
		System.out.println("Local variable of main method i="+i);

		LocalVsGlobalVariables obj=new LocalVsGlobalVariables();

		System.out.println(obj.name);
		System.out.println(obj.age);
		
		obj.sum();

	}
	public void sum() {
		int i=15; //Local variables of method sum()
		int j=20;
		int age=30;
		System.out.println("local variables of sum method="+i+","+j+","+age);
	}
}