package stringConcepts;

public class StringPerformanceTest {

	public static String concatWithString(){  
		//	String t = "Java";  
		String s=new String("snow");
		for (int i=0; i<10000; i++){  
			//	t = t + "Tpoint";  
			s=s.concat("Tpoint");
		}  
		return s;  
	}  
	public static String concatWithStringBuffer(){  
		StringBuffer sb = new StringBuffer("Java");  
		for (int i=0; i<10000; i++){  
			sb=sb.append("Tpoint"); 
		}  
		return sb.toString();  
	}  
	public static void main(String[] args){  
		long startTime = System.currentTimeMillis();  
		concatWithString();  

		System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+" ms");  
		startTime = System.currentTimeMillis();  
		concatWithStringBuffer();  

		System.out.println("Time taken by Concating with  StringBuffer: "+(System.currentTimeMillis()-startTime)+" ms");  
	}  
} 