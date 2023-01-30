package javaPractise;

public class ExceptionHandling
{
	public static void main(String[] args) {
		int a=10;
		int b=0;
		try
		{
			int result = a/b;
			System.out.println(result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero error");
		}
		finally {
			System.out.println("This is Finally block");
		}
	}
}