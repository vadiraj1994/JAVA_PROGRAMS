package Program;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class PrintDuplicateansuniqueonlyString2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s = sc.nextLine();
		String a = s.toLowerCase();
		LinkedHashSet<Character> h=new LinkedHashSet<Character>();
		for (int i = 0; i < a.length(); i++) {
			h.add(a.charAt(i));
		}
		System.out.println(h);
		for (Character str : h) 
		{
		int count=0;
		for (int i = 0; i < a.length(); i++) 
		{
			if(str==a.charAt(i))
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
		