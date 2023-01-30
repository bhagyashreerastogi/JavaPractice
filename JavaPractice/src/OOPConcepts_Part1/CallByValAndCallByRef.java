package OOPConcepts_Part1;

public class CallByValAndCallByRef {
	int p;
	int q;

	public static void main(String[] args) {

		CallByValAndCallByRef obj=new CallByValAndCallByRef();

		int x=10;
		int y=20;
		System.out.println(obj.testSum(x, y)); //call by value or pass by value

		obj.p=50;
		obj.q=60;

		obj.swap(obj); // Call by reference
		//after swap
		System.out.println("p:"+obj.p);
		System.out.println("q:"+obj.q);
	}

	public int testSum(int a, int b) {
		System.out.println("value of a"+a+ "& value of b"+b);
		a=30;
		b=40;
		int c=a+b;
		return c;
	}

	// Call by reference: we are passing the value of object reference.
	// By using object references, we have to pass object reference.
	public void swap(CallByValAndCallByRef t) {
		int temp;
		temp=p; //temp=50
		p=q;  //t.p=60
		q=temp; //t.q=50
	}
}