package OOPConcepts_Part2;

public class TestCarMain {

	public static void main(String[] args) {

		//wrong statement->Static polymorphism =compile time polymorphism
		//correct-> method overriding = dynamic polymorphism = runtime polymorphism 
		BMW b=new BMW();
		b.start();  //when have same methods in child n parent class, 
					//preference will be given to child class method.
		b.stop();
		b.Refuel();
		b.theftSafety();
		b.engine();
		
		System.out.println("*****************");

		Car c=new Car();
		c.start();
		c.stop();
		c.Refuel();
		c.engine();
	//	c.theftSafety(); // not possible-parent class cannot inherit some/all properties from child class.

		System.out.println("*****************");

		//Top Casting
		Car c1=new BMW(); //child class object can be referred by parent class reference variable -- dynamic polymorphism or Runtime polymorphism
		c1.start();
		c1.stop();
		c1.Refuel();
		c1.engine();
	//	c1.theftSafety(); //not possible-since child class obj is referred by parent class reference variable c1.

		//Down Casting
	//	BMW b1=(BMW) new Car(); // converting Car class object into BMW caste - Down casting is not allowed, it will give ClassCastException at runtime.

	}
}