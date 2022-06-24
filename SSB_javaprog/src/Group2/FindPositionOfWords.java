package Group2;

import java.util.LinkedHashSet;

public class FindPositionOfWords
{
	public static void main(String[] args) 
	{
		String s="welcome to india";
		String[] str = s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<>();
		for (int i = 0; i < str.length; i++) 
		{
			set.add(str[i]);//Add All the characters in set..
		}
		for (String word: set) 
		{
			for (int i = 0; i < str.length; i++)
			{
				if(word.equals(str[i]))
				{
					System.out.println(word+" position is:"+(i+1));;
					break;//not to print position of same character again.. 
				}
			}	
		}
	}
}