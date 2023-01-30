package OOPConcepts_Part2;

public class Test extends Shape{

	Test(){
		System.out.println("Test Class constructor");
	}

	public static void main(String[] args) {

		Shape s = new Test();
		s.draw();
		s.fill();

		Test t=new Test();
		
		EncapsulationConcept encap=new EncapsulationConcept();
		encap.setEmpName("Piya");
		System.out.println(encap.getEmpName());
	
	}

	void erase() {
		System.out.println("test--- erase");
	}
	void draw() {
		System.out.println("Test --- Draw");
	}

}