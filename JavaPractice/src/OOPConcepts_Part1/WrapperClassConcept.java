package OOPConcepts_Part1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		String x="100";
		System.out.println(x+20);

		//data conversion from string to int:
		int i=Integer.parseInt(x); 
		System.out.println(i+20);

		//Wrapper classes: Integer, Double, Character, Boolean

		//String to double conversion:
		String y="12.33";
		double d= Double.parseDouble(y);
		System.out.println(d+10);
	
		// self try - Char to String:
		char a='x';
		System.out.println(a);
		String ss=String.valueOf(a);
		System.out.println("value of ss="+ss);

		//String to boolean:
		String k="true";
		boolean b=Boolean.parseBoolean(k);
		System.out.println(b);

		//int to String conversion:
		int j=200;
		System.out.println(j+20); 

		String s=String.valueOf(j); //200
		System.out.println(s+20);

		//For converting String into int, string should be pure string.
		//else it will give below exception:
		String u="100A"; 
		Integer.parseInt(u); //NumberFormatException -- for input string: "100A"
	}
}