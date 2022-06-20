package Program;

import java.util.HashSet;

public class PrintDuplicateString {

	public static void main(String[] args) {
		String s= "satvamav";
		//step1:remove duplicate char in given string
		HashSet<Character> h=new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			h.add(s.charAt(i));
		}
		System.out.println(h);
		
		//step 2:compare each char of set with all char of given string
		for (Character str : h) 
		{
		int count=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)==str)
			{
				//step3:if it is matching ,increment count
				count++;
			}
		}
		if(count>1)
		{
			System.out.println(str+" : " +count);
		}
		if(count==1)
		{
			System.out.println(str+" : " +count);
		}
		}
			
	}
}
		