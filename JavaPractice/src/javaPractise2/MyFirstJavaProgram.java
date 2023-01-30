package javaPractise2;

public class MyFirstJavaProgram {

	/* This is my first java program.
	 * This will print 'Hello World' as the output
	 */

	public static void main(String []args) {
		System.out.println("Hello World"); // prints Hello World
	}
}


class FinallyExample{  
	public static void main(String[] args){  
		try{  
			int x=300;  
		}catch(Exception e){
			System.out.println(e);
		}  
		finally{
			System.out.println("finally block is executed");
		}  
	}
}