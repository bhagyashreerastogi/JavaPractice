package javaPractise2;

public class ExceptionHandling {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try
		{
			int ar[]=new int[5];                
			System.out.println(ar[10]);  

			/*int result = a/b;
			System.out.println(result);*/

		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException: Divide by zero error");
		}	
		catch(ArrayIndexOutOfBoundsException e)  
		{  
			System.out.println("ArrayIndexOutOfBounds: Exception occurs");  
		}  
		catch(Exception e)
		{
			System.out.println("Parent exception");
		}
		System.out.println("Hello Java");
		System.out.println("Hello Selenium");
	}
}

// In this example, try block contains two exceptions. 
// But at a time only one exception occurs and its corresponding catch block is invoked.