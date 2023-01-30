package Test_Programs;

public class Ques4 
{
	static String s;
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println("1");
			int i=s.length();
			System.out.println(i);  // It will not print anything
			System.out.println(s.charAt(0));
			System.out.println("2");
		}
		catch(ArithmeticException e) 
		{
			System.out.println("3");
		}
		catch(StringIndexOutOfBoundsException e) 
		{
			System.out.println("4");
		}
		catch(Exception e) 
		{
			System.out.println("5");
		}
		finally
		{
			System.out.println("6");
		}
	}
}