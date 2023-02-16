package javaPractise; // static program 

import java.util.Scanner;

public class sorttest {

	public static void main(String[] args) {
		int n, temp;
		
		int a[] = {2,4,7,12,1,23};
		n=a.length;
		
		for (int i = 0; i < n; i++) 
		{
			for (int j = i + 1; j < n; j++) 
			{
				if (a[i] < a[j]) 
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("\nDescending Order:\n");
		for (int i = 0; i <= n - 1; i++) 
		{
			System.out.print(a[i] + "\n");
		}

		System.out.print("\nAcending Order:\n");
		for(int i=n-1;i>=0;i--) 
		{
			System.out.print(a[i] + "\n");	
		}	
	}
	}


