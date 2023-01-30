// 
package javaPractise;

public class Fibonacci {

	// fibonacci using for loop
	  void printFibonacci(int maxNum) {
		int previousNum=0, nextNum=1;
		System.out.print("Fibonacci Series of "+maxNum+" numbers - ");
		
		for(int i=0;i<=maxNum-1;i++) {
			System.out.print(previousNum+" ");
			int sum=previousNum+nextNum;
			previousNum=nextNum;
			nextNum=sum;
		}		
	}	
	
	public static void main(String[] args) {
		
	//	printFibonacci(10);
	}
}