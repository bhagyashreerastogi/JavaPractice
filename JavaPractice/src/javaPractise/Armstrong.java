package javaPractise;

import java.util.Scanner;

public class Armstrong {

	public void armstrong() {
		int temp, c=0,n,a;
		System.out.println("Enter the number to be checked: ");
	
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		
		temp=n;
		
		while(n>0) 
		{
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		if(temp==c) {
			System.out.println("Number is armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}
	}
}