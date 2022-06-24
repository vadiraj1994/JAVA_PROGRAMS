package Group1;

import java.util.LinkedHashSet;

public class PrintUniqueChar {

	public static void main(String[] args) 
	{
		String s="india";
		//step1:remove duplicate word//
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) 
		{
			set.add(s.charAt(i));
		}
		//step2:compare each word of set with all words from given string
		for (Character ch : set) 
		{
			int count=0;
			for (int i = 0; i < s.length(); i++) 
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			if(count==1) 
			{
				System.out.print(ch+" ");	
			}

		}

	}
}
