package StringPrograms;

public class paliandrome {

	public static void main(String[] args) {
		String a="mama";
		String s = a.toUpperCase();
		String rev="";
		for(int i=0;i<s.length();i++)
		{
			rev=rev+s.charAt(i);
		}
		//System.out.print(rev);
		
		if(s.equals(rev)) {
			System.out.println(rev+" its a paliandrome");
		}
		else {
			System.out.println(rev+" not a paliandrome");
		}
	}
	
}
