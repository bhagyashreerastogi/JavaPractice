package javaPractise;

public class GETest1 {

	public static void main(String[] args) {
				
		//	  WAP to count no of repeated char in word "Hello"
		int count=1; String s="hello";
		char arr[]= s.toCharArray();
		int n1=arr.length;
		System.out.println("value of n1="+n1);
		for(int i=0;i<n1;i++) 
		{ 
			for(int j=i+1;j<n1;j++) 
			{ 
				if(arr[i]==arr[j]) 
				{ 
					count=count+1;
					arr[j]=+'0';
				}
			}
			if(arr[i]!='0')
				System.out.println((arr[i]+" ="+count));
			count=1;
		}
			
		//  WAP to print a array in reverse order 
		int ar[]= {1,2,3,4,5}; 
		int n2=ar.length;
		System.out.println("Value of n2="+n2);
		for(int i=n2-1; i>=0;i--) { 
			System.out.println(ar[i]);
		}
				
		// Write a for loop for infinite loop
		
		// find 2nd highest sal-
		//select SAL from EMP_table oder by SAL desc row 2;
	
	}
}