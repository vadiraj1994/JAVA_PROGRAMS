package Program;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class PrintpositionArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s = sc.nextLine();
		LinkedHashSet<Character> h=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			h.add(s.charAt(i));
		}
		System.out.println(h);
		for (Character str : h) 
		{
		for (int i = 0; i < s.length(); i++) 
		  {
			if(str==s.charAt(i))
			{
				System.out.println(str+" "+i);
			}
		  }
		}	
	}
}
		