package Group1;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class PrintDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s = sc.nextLine();
		s=s.toLowerCase();
		//step1:remove duplicate word//
		LinkedHashSet<Character> l=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++) {
			l.add(s.charAt(i));
		}
		//step2:compare each word of set with all words from given string
		for(Character ch:l)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			if(count>1)
				System.out.println(ch+":"+count);
		}
	}
}