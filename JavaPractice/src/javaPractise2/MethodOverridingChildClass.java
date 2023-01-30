package javaPractise2;

// Method Overriding

public class MethodOverridingChildClass extends MethodOverridingParentClass{

	public void myMethod(){
		System.out.println("I am a method from Child Class");
	}

	public static void main(String [] args){
		MethodOverridingParentClass obj1 = new MethodOverridingChildClass();
		// It calls the child class method myMethod()
		obj1.myMethod();

		MethodOverridingParentClass obj2= new MethodOverridingParentClass();
		obj2.myMethod(); // It will call myMethod of parent class

		MethodOverridingChildClass obj3= new MethodOverridingChildClass();
		obj3.myMethod(); // It will call myMethod of child class

		MethodOverridingChildClass obj4 = (MethodOverridingChildClass) new MethodOverridingParentClass(); 
		// giving runtime error: Exception in thread "main" java.lang.ClassCastException: javaPractise.MethodOverridingParentClass cannot be cast to 
		// javaPractise.MethodOverridingChildClass
		// at javaPractise.MethodOverridingChildClass.main(MethodOverridingChildClass.java:20)
		obj4.myMethod();
	}
}

