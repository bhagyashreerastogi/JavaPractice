package javaPractise;

public class OccuranceOfRepeatedWords {

	public void NoOfRepeatedWords() {

		String a="Ram Killed Ravana Ravana in Lanka Lanka Lanka";

		String[] words=a.split(" ");	//Split the word from String
		int wrc=1;							//Variable for getting Repeated word count
		
		System.out.println(words.length);

		for(int i=0;i<words.length;i++)		//Outer loop for Comparison		
		{
			for(int j=i+1;j<words.length;j++)	//Inner loop for Comparison
			{
				if(words[i].equals(words[j]))	//Checking for both strings are equal
				{
					wrc=wrc+1;				//if equal increment the count
					words[j]="0";			//Replace repeated words by zero
				}
			}
			if(words[i]!="0")
				System.out.println(words[i]+"-->"+wrc);	//Printing the word along with count
			wrc=1;
		}  			
	}
}
