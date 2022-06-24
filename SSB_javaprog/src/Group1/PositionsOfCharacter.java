package Group1;

import java.util.LinkedHashSet;

public class PositionsOfCharacter
{
	public static void main(String[] args) 
	{
		String s="india";
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) 
		{
			set.add(s.charAt(i));//Add All the characters in set..
		}
		for (Character character : set) 
		{
			for (int i = 0; i < s.length(); i++)
			{
				if(character==s.charAt(i))
				{
					System.out.println(character+" position is:"+(i+1));;
					break;//not to print position of same character again.. 
				}
			}	
		}
	}
}
