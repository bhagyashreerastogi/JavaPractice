package javaPractise2;

public class StringExample{  

	public static void main(String args[]){  
		String s1="java";//creating string by java string literal  
		char ch[]={'s','t','r','i','n','g','s'};  
		String s2=new String(ch);//converting char array to string  
		String s3=new String("example");//creating java string by new keyword  
		System.out.println(s1);  
		System.out.println(s2);  
		System.out.println(s3);  

		System.out.println("***********************");
		String s4="Sachin";  
		String s5="Sachin";  
		String s6=new String("Sachin");  
		System.out.println(s4==s5);//true (because both refer to same instance)  
		System.out.println(s4==s6);//false(because s3 refers to instance created in nonpool)  
		
		System.out.println("***********************");
		System.out.println(s4.equals(s6));
		System.out.println(s4.equals(s5));
		System.out.println(s6.equals(s5));
		
		System.out.println("***********************");
		
		String a="welcome";
		StringBuilder sb=new StringBuilder(a);
		sb.append(" java");  
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		int value=20; 
		String s=String.valueOf(value); 
		System.out.println(s+17);       


	}
}  