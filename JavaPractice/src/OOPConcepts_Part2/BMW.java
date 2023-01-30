package OOPConcepts_Part2;

public class BMW extends Car{ //("has-a relationship")

	// When same method is present in parent class as well as in child class with same name and same number of arguments, 
	// It is call method overriding.
	public void start() { //Overridden method
		System.out.println("BMW---start");
		super.start();
	}

	public void theftSafety() {
		System.out.println("BMW---theftSafety");

	}

	{
		super.start();
	}
}
