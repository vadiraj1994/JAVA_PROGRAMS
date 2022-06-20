package StringPrograms;

public class Reverseofstring {

	public static void main(String[] args) {
		/*
		 //----method-1----//
		String s="program";
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		*/
		//----method-2----//
		String s="program";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		//System.out.print(rev);
		
		if(s.equalsIgnoreCase(rev)) {
			System.out.println(" its a paliandrome");
		}
		else {
			System.out.println(" not a paliandrome");
		}
	}

}
