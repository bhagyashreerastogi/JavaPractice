package Test_Programs;

public class Ques2
{
	public static void reverse()
	{
		String a="My Name is Bhagya";//"Welcome to Genpact";
		String reverseString ="";
		String words[]=a.split(" ");
		int n=words.length;
		for(int i=n-1;i>=0;i--) 
		{
			reverseString =reverseString +words[i]+" " ;
		}
		System.out.println(reverseString);

		//************************************
		int length=a.length();
		String reverseChar="";
		for(int i=length-1;i>=0;i--) 
		{
			reverseChar =reverseChar + a.charAt(i) ;
		}System.out.println("reverse string char="+reverseChar);
	}
	public static void main(String[] args) 
	{
		Ques2.reverse();
	}	
}