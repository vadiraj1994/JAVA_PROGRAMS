package Group1;

import java.util.LinkedHashSet;

public class PrintDuplicateChar {

	public static void main(String[] args) 
	{
		String s="india";

		//step1:To print duplicate word//
		LinkedHashSet<Character> l=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++) {
			l.add(s.charAt(i));
		}
		//step2:compare each word of set with all words from given string
		for(Character ch:l)//Set is index based..
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			if(count>1)
			{//To print Duplicate Word..
				System.out.println(ch+":"+count);
			}
		}
	}
}