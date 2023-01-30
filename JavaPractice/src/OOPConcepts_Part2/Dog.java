package OOPConcepts_Part2;

public class Dog extends Animal{

	public static void main(String[] args) {

		Dog d= new Dog();
		d.eat();
		d.sleep();
		Animal.scream(); // correct way of calling static methods
		//	d.scream(); // it will give warning
		d.legs();

		System.out.println("********************");
		Animal a = new Dog(); 
		a.legs();
		a.eat();
		a.sleep();
		//	a.scream();

	}

	@Override
	public void sleep() {
		System.out.println("Animal--- Sleep");
	}

	
	public void m2() {
		
	}
}