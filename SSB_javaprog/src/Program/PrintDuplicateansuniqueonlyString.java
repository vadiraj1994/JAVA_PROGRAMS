package Program;

import java.util.LinkedHashSet;

public class PrintDuplicateansuniqueonlyString {

	public static void main(String[] args) {
		String s= "satvamav";
		LinkedHashSet<Character> h=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			h.add(s.charAt(i));
		}
		System.out.println(h);
		for (Character str : h) 
		{
		int count=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(str==s.charAt(i))
			{
				count++;
			}
		}
		if(count>1)
		{
			System.out.println(str+" : "+count);
		}
		if(count==1)
		{
			System.out.println(str+" : " +count);
		}
		}
			
	}
}
		