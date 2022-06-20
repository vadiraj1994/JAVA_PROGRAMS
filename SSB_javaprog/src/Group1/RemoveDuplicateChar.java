package Group1;

import java.util.LinkedHashSet;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome";
		//step1:remove duplicate char//
		LinkedHashSet<Character> l=new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) {
			l.add(s.charAt(i));
			
		}
		System.out.println(l);	
		}

	}


