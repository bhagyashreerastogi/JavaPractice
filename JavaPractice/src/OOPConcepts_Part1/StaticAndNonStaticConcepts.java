package OOPConcepts_Part1;
public class StaticAndNonStaticConcepts {

	// global variable: the scope of global vars will be available- 
	// -across all the functions with some conditions 
	// Static var/methods are not part of object.
	// They will be stored at common java memory.
	// Separate memory allocation will be given to static methods/var.
	
	String name="Tom"; //non static global variable
	static int age=24; //static global variable

	public static void main(String[] args) {

		//how to call static variables and method:
		//1. direct calling
		sum();
		//2. calling by class name
		StaticAndNonStaticConcepts.sum();

		System.out.println(age);
		System.out.println(StaticAndNonStaticConcepts.age);

		//how to call non static method and var:
		StaticAndNonStaticConcepts obj=new StaticAndNonStaticConcepts();
		obj.sendMail();
		System.out.println(obj.name);

		//can I access static method by using object reference? 
		obj.sum(); //Yes, but one warning will be given.It is not a good practice
	}

	public void sendMail() { //non static method
		System.out.println("Send Mail method");
	}

	public static void sum() { //static method
		System.out.println("sum method");
	}
}