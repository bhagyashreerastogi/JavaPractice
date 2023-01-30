package javaPractise;

//import com.sun.jna.StringArray;

public class abc{
	public static void main(String ar[]) {
		String a="meow";
		String ab=a+"deal";
		String abc= "meowdeal";
		System.out.println(ab); //meowdeal
		System.out.println(ab==abc); //false
	
		String A=" Wild ";
		String B=" Irish ";
		String C=" Rose ";
		String res=A.trim()+B.trim()+C.trim();
		System.out.println(res); //WildIrishRose
		
		String c="abc";
		String d="abc";
		
		System.out.println(c.equals(d)); //true
		System.out.println(c==d); //true
		
		
		
	}
}