package OOPConcepts_Part1;

public class Functions {

	//main method--> starting point of execution
	//main method is void coz it will never return any value.
	//So we never write return statement inside main method.
	public static void main(String[] args) {

		Functions obj=new Functions();
		//one object will be created and obj is the reference variable , referring to this object.
		//after creating object, the copy of all non static method will be given to this object.
		//To call non static method, we need to create object.

		obj.test();
		int l=obj.pqr();
		System.out.println("Result of pqr= "+l);
		String a=obj.qa();
		System.out.println("Result of qa= "+a);
		int z=obj.division(100, 5);
		System.out.println("The result of division= "+z);		
	}
	
	//non static methods/functions: 

	//void will not return any value.
	//return type = void
	public void test(){  //1. no input, no output
		System.out.println("Test method");
	}

	//return type = int
	public int pqr(){  //2. no input, some output
		System.out.println("PQR method");
		int a=10;
		int b=20;
		int c=a+b;

		return c;
	}

	//return type = String
	public String qa(){ //2. no input, some output
		System.out.println("QA method");
		String s="Selenium";

		return s;
	}

	//return type = int
	//x,y --> input parameters/arguments
	public int division(int x, int y) {
		System.out.println("Division method");
		int d=x/y;

		return d;
	}
}