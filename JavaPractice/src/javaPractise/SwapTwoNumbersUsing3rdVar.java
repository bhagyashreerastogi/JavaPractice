package javaPractise;
import java.util.Scanner;
public class SwapTwoNumbersUsing3rdVar {

	// Example of static method
	// we can call static method directly without creating its object. 
	static void swap()
	{
		int x, y, temp;
		System.out.println("Enter x and y : ");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();

		System.out.println("Before Swapping : " + x +","+ y);

		temp = x;
		x = y;
		y = temp;

		System.out.println("After Swapping : " + x + ","+y);
	}
}