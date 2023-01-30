package OOPConcepts_Part2;

public class HSBCBank implements USBank, BrazilBank{
	//we are achieving multiple inheritance.
	//Is-a relationship

	//If a class is implementing any interface, 
	//then its mandatory to define/override all the methods of interface.
	
	//Overridden methods from USBank interface:
	public void credit(){
		System.out.println("HSBC----credit");
	};
	public void debit(){
		System.out.println("HSBC----debit");
	};
	public void transferMoney(){
		System.out.println("HSBC----transferMoney");
	};
	
	public static void test1() {
		System.out.println("HSBC- test1");
	}
	
	/*
	 * public void test2() { System.out.println("HSBC- test2"); }
	 */

	//Separate own methods of HSBCBank class
	public void educationLoan(){
		System.out.println("HSBC----educationLoan");
	}
	public void carLoan(){
		System.out.println("HSBC----carLoan");
	}

	//Overridden methods from BrazilBank interface
	public void mutualFunds() {
		System.out.println("HSBC----mutualFunds--From BrazilBank");
	}
}