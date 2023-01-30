package OOPConcepts_Part1;

public class Car {

	//Class variables/instance variable
	int mod;
	int wheel;

	public static void main(String[] args) {

		//new Car() is the object of Car class
		//a,b,c are 'Object reference variables' which are representing Car objects.
		//new keyword is used to create object

		Car a= new Car(); 
		Car b= new Car();
		Car c= new Car();

		a.mod=2015;  // Initialization through reference
		a.wheel=4;

		b.mod=2014;
		b.wheel=3;

		c.mod=2013;
		c.wheel=2;

		System.out.println("*******Before shifting references*****");
		
		System.out.println(a.mod);
		System.out.println(a.wheel);

		System.out.println(b.mod);
		System.out.println(b.wheel);

		System.out.println(c.mod);
		System.out.println(c.wheel);

		System.out.println("*******After shifting references*****");
		a=b;
		b=c;
		c=a;
		
		a.mod=10;
		System.out.println(a.mod); //10
		c.mod=20;
		System.out.println(a.mod); //20
		System.out.println(c.mod);

		

	}
}