package OOPConcepts_Part2;

public abstract class Animal {
	
	Animal(){ // possible/valid
		System.out.println("I am constructor of abstract class Animal");
	}

	public void eat() { // non abstract method
		System.out.println("Animal--- eat");
	}
	
	public abstract void sleep(); // abstract method
	public abstract void m2();
	
	public static void scream() { //static method
		System.out.println("Animal -- scream");
	}

	public final void legs() { //final method
		System.out.println("Animals have 4 legs");
	}
	
	
}