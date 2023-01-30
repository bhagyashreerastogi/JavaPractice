package javaPractise;

public class MultipleCatchBlocks {

	public static void main(String[] args) {  

		try{    
			String s=null;  
			System.out.println(s.length());  
		//	int a=5/0;
	//		int a[]=new int[2];
	//		System.out.println(a[3]);
		}    
		catch(ArithmeticException e)  
		{  
			System.out.println("Arithmetic Exception occurs");  
		}    
		catch(ArrayIndexOutOfBoundsException e)  
		{  
			System.out.println("ArrayIndexOutOfBounds Exception occurs");  
		}    
		catch(Exception e)  
		{  
			System.out.println("Parent Exception occurs");  
		}  
		finally 
		{
			System.out.println("This is finally block");    
		}
		System.out.println("******end of the program********");    
	}  
} 