package StringPrograms;

public class Reverseofstringwithoutlengthmthd {

	public static void main(String[] args) {
		String a="Program";
		String s = a.toUpperCase();//PROGRAM
		char[] ch = s.toCharArray();
		int count=0;
		for (char c : ch) 
		{
			count++;
		}
		//System.out.print(count);
		
		for(int i=count-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}
}
