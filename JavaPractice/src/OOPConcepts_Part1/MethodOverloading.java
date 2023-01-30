package OOPConcepts_Part1;

public class MethodOverloading {

	public static void main(String[] args) {

		MethodOverloading obj=new MethodOverloading();
		obj.sum();
		obj.sum(2);
		obj.sum(3.4);
		obj.sum(5, 8);
	}

	public static void main(String a) {		
		System.out.println("String main method with 1 string parameter");
	}

	public static void main(int p) {		
		System.out.println("In main method with 1 int parameter");
	}

	public static void main(int p,int q) {		
		System.out.println("In main method with 2 int parameter");
	}

	//We can overload main method
	//You cannot create method inside a method.
	//Duplicate methods -- i.e. same method name with same number of arguments or same type of arguments are not allowed.

	//Method Overloading --> When the method name is same with different arguments or input parameters within the same class.
	public void sum() { // 0 input parameter
		System.out.println("0 sum method");	
	}

	public void sum(double d) { // 1 input parameter
		System.out.println("sum method with different type of argument");	
	}

	public void sum(int i) { //1 input parameter
		System.out.println("1 sum method");	
		System.out.println(i);
	}
	public void sum(int i,int j) { //2 input parameter
		System.out.println("2 sum method");
		System.out.println(i+","+j);
	}
}