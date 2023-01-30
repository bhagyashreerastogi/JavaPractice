package javaPractise;

public class ReverseWordsInString {
	
	public void reverseWordInMyString(String str)
	{
		/* The split() method of String class splits
		 * a string in several strings based on the
		 * delimiter passed as an argument to it
		 */
		String[] words = str.split(" ");
		String reversedString = "";
		int n=words.length;
		System.out.println("no of words in string is:"+n);
		
		for (int i = 0; i <n; i++)
		{
			String word = words[i]; 
			String reverseWord = "";
			int wn=word.length();
		//	System.out.println("no of char in word is:"+wn);
			for (int j =wn-1; j >= 0; j--) 
			{
				/* The charAt() function returns the character
				 * at the given position in a string
				 */
				reverseWord = reverseWord + word.charAt(j);
			}
			reversedString = reversedString + reverseWord + " ";
		}
		System.out.println(str);
		System.out.println(reversedString);
	}
	
	
	public static void main(String[] args) 
	{
		ReverseWordsInString obj = new ReverseWordsInString();
		obj.reverseWordInMyString("Welcome to Beginners Book");
		
	}
}