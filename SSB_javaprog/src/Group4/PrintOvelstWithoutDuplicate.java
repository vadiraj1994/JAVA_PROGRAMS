package Group4;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class PrintOvelstWithoutDuplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s=s.toLowerCase();
		//step1:remove duplicate char//
		LinkedHashSet<Character> l=new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) 
		{
			l.add(s.charAt(i));
		}

		//step2:compare each char of set with all char from given string
		for (Character str : l) 
		{
			for (int i = 0; i < s.length(); i++) 
			{
			if(str=='a' ||str=='e' || str=='i' ||str=='o' || str=='u')
			{
				System.out.print(str);
				break;
			}
		}
	
		}

	}

}
