package javaPractise;

public class SecondHighestNumberInArray {

	static void SecondHighestNumberInArray1() 
	{
		int arr[] = { 14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
		int largest = arr[0];
		int secondLargest = arr[0];

		System.out.println("The given array is:");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + "\t"); // "\t" is used to print space between elements.
		}

		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] > largest)
			{
				secondLargest = largest;
				largest = arr[i];
			}
			else if (arr[i] > secondLargest && arr[i] != largest)
			{
				secondLargest = arr[i];
			}
		}
		System.out.println("\nSecond largest number is: " + secondLargest); // "\n" is used to print in next line.
	}
}