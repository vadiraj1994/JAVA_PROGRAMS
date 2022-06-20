package Program;

import java.util.LinkedHashSet;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		//input string is hello//
		String s= "hello";
		//output should be helo//
		//step1:remove duplicate char in given string//
		LinkedHashSet<Character> h=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			h.add(s.charAt(i));
		}		
		//step 2:compare each char of set with all char of given string
		for (Character str : h) 
		{
		System.out.print(str);
		}
			
	}
}
		