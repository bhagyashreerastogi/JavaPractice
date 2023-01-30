package javaPractise;

public class HighestNumber {
	public static int getSecondLargest(int[] a, int total)
	{  
		int temp;  
		for (int i = 0; i < total; i++)   
		{  
			for (int j = i + 1; j < total; j++)   
			{  
				if (a[i] > a[j])   
				{  
					temp = a[i];  
					a[i] = a[j];  
					a[j] = temp;  
				}  
			}  
		}  
		return a[total-2];  
	}  
	public static void main(String args[]){  
		int a[]={1,2,5,6,3,4,6,7,8,9};   
		int b[]= {77,33,22,55,78,55,90,81,40,56,90};  
		System.out.println("Second Largest: "+getSecondLargest(a,10));  
		System.out.println("Second Largest: "+getSecondLargest(b,11));  
	}
}