package Program;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class PrintchangepositionArray {

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
		//taking latest occurance of elements
		for (int i = s.length()-1; i >=0; i--) 
		{
			if(str==s.charAt(i))
			{
				System.out.println(str+" "+i);
				break;
			}
		
		}
		}	
	}
}
		