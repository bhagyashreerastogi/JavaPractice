package OOPConcepts_Part2;

public interface USBank {

//	static final
	int min_bal=100; //by default static n final, no need to write explicitly 

	public void credit(); 
	public void debit();
	public void transferMoney();
	public static void test1() {
		System.out.println("USBank- test1");
	}
	public default void test2() {
		System.out.println("USBank- test2");
	}

	//public int mymethod(int num1, int num2);
	
	// Interface properties:
	
	//*only method declaration--means no method body--only method prototype
	//*In interface, we can declare variables,Vars are by default static in nature.
	//*variable value will not be changed, coz its final/constant in nature.
	//*no static method in interface- coz its part of oop concepts. 
	///It is part of objects and objects cannot have static methods.
	///that's why we can't write static methods inside interface.
	//*No main method in Interface
	//*Interface is abstract in nature - we cannot create the object of interface.
	//+100% Abstraction
}