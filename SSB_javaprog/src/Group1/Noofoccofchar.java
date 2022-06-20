package Group1;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Noofoccofchar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s = sc.nextLine();
		s=s.toLowerCase();
		//step1:remove duplicate word//
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		//step2:compare each word of set with all words from given string
		for (Character str : set)
		{
			int count=0;
			for (int i = 0; i < s.length(); i++) 
			{
			if(str==s.charAt(i))
			{
				count++;
			}
		}
		System.out.println(str+":"+count);	
		}

	}

}
