package Group2;

import java.util.LinkedHashSet;

public class NoofoccofWord {

	public static void main(String[] args) {
		String s="welcome_to_india";
		String[] str = s.split("_");
		//step1:Create an Object //
		LinkedHashSet<String> set=new LinkedHashSet<>();
		for (int i = 0; i < str.length; i++) 
		{
			set.add(str[i]);
		}
		//step2:compare each word of set with all words from given string
		for (String word : set) 
		{
			int count=0;
			for (int i = 0; i < str.length; i++) 
			{
			if(word.equals(str[i]))
			{
				count++;
			}
		}
		System.out.println(word+":"+count);	
		}

	}

}
