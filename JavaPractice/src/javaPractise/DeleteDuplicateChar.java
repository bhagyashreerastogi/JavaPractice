package javaPractise;

public class DeleteDuplicateChar {

	public void DeleteDuplicateChar1() {

		String str = "aaaaabbbbbcccctttttuuuuuuooooouuuuuiiiii";
		int cnt = 0;
		char[] inp = str.toCharArray();

		for (int i = 0; i < str.length(); i++) 
		{
			for (int j = i + 1; j < str.length(); j++) 
			{
				if (inp[i] == inp[j]) 
				{
					inp[j]=0;
					cnt++;
				}
			}
			if(inp[i]!=0)
				System.out.println(inp[i]+"-->"+cnt);	//Printing the char along with count
			cnt=1;
		}		
	}
}