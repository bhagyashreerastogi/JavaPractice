package javaPractise;

public class ReplaceWordwithoutUsingReplaceMethod {
	String s = "Bhagya hello how are you? hello good say hello"; // replace hello with hi without using replace fun
	String oldval = "hello";
	String newval = "hi";

	public static void main(String[] args) {
		ReplaceWordwithoutUsingReplaceMethod ob = new ReplaceWordwithoutUsingReplaceMethod();
		ob.M1();
	}

	public void M1() 
	{		
		String[] strSplit = s.split(" "); // split string by no space
		System.out.println(strSplit.length);
		
		for(int i=0;i<strSplit.length;i++) 
		{ 
			if(strSplit[i].equals(oldval)) 
			{				
				strSplit[i]=newval;
				System.out.print(strSplit[i]+" "); 
			} else 
				System.out.print(strSplit[i]+" "); 
		}
	}
}