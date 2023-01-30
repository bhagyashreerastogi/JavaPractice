package Test_Programs;

public class Child extends Parent{
	public void m2(){
		System.out.println("def");
	}
	public void m3(){
		System.out.println("ijk");
	}	

	public static void main(String[] args) {
		/*Parent obj = new Child();
		Child obj1= (Child) obj;
		obj1.m2();*/  //output --> def

		Parent obj= new Child();
	//	obj.m3(); // compiler error
	}
}
