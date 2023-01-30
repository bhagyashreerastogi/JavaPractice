package Test_Programs;

public class Ques5 {
	static {
		System.out.println("one");
	}
	Ques5(){
		System.out.println("two");
	}
	public static void main(String[] args) {
		System.out.println("three");
		Ques5 q1=new Ques5();
		System.out.println("four");
	}
	{
		System.out.println("five");
	}
}