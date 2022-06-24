package Group1;

import java.util.LinkedHashSet;

public class Noofoccofchar {

	public static void main(String[] args)
	{

		String s="india";
		//step1:Create an object and maintain insertion order//
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) 
		{
			set.add(s.charAt(i));//Add All the characters in set..
		}
		//step2:compare each word of set with all words from given string
		for (Character ch : set)
		{
			int count=0;
			for (int i = 0; i < s.length(); i++) 
			{
			if(ch==s.charAt(i))//Step3:If It is Matching Increment the Count..
			{
				count++;
			}
		}
		System.out.println(ch+":"+count);//Print Both Character And Count.
		}

	}

}
