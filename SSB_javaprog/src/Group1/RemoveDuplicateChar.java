package Group1;

import java.util.LinkedHashSet;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		String s="india";

		//step1:Remove duplicate char//
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++)
		{
			set.add(s.charAt(i));

		}
		for (Character character : set) 
		{
			System.out.print(character);	
		}

	}
}


