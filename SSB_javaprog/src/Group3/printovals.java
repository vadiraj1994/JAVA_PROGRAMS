package Group3;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class printovals {

	public static void main(String[] args) 
	{
		//input="aabbca"; and output="a2b2c1a1"
		String s="tutor";
		
		for (int i = 0; i < s.length(); i++) 
		{			
			int count=1;//count always start from '1' for every iteration  of 'for' loop
			char ch = s.charAt(i);
			
			for (int j = i+1; j < s.length(); j++) 
			{
				if(ch=='a' ||ch=='e' || ch=='i' ||ch=='o' || ch=='u')
				{
					count++;
					i++;//*in order to avoid repetition of the same char otherwise we get "a2a1b2b1c1a1"
				}
				else
				{
					break;
				}
			}
		System.out.print(ch+"");
		}
	}

}
