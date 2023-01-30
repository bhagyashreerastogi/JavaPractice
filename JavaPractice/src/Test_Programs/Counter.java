package Test_Programs;

public class Counter {
	static int count;
	public Counter(){
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		System.out.println(count); // 0
		Counter c1= new Counter(); // 1
		Counter c2= new Counter(); // 2
		Counter c3= new Counter(); // 3
		System.out.println(count); // 3
	}
}
