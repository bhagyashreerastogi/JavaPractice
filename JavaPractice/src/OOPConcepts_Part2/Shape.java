package OOPConcepts_Part2;

public abstract class Shape {
	
	Shape(){
		System.out.println("Shape class constructor");
	}
	
	int color;
	
	abstract void draw();
	abstract void erase();
	
	public void fill() {
		System.out.println("Shape- fill method");
	}

	//We cannot create object of interface or abstract class.
	
	
}