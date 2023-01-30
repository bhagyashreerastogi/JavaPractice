package Test_Programs;

import java.util.ArrayList;
import java.util.List;

public class Ques3 
{
//	static int arr[];static int i; 
	static int arr[];
	static void checkPrime(int a)
	{  
	//	List<Integer> PrimeNos = new ArrayList<Integer>();
	//	int[] PrimeNos = new int[1000];
		/*
		 * for(int a=1;a<=1000;a++) {
		 */			
			int m=0,flag=0;      
			m=a/2;      
			if(a==0||a==1){  
				System.out.println("\n"+ a+" is not prime number\n");      
			}else{  
				for( int i=2;i<=m;i++){      
					if(a%i==0){      
						System.out.println(a+" is not prime number\n");      
						flag=1;      
						break;      
					}      
				}      
				if(flag==0)  
				{ 
					System.out.println(a+" is prime number\n");
				}  
			}//end of else  
		//} 
	}
	public static void main(String[] args) 
	{
		Ques3.checkPrime(10);
	}
}