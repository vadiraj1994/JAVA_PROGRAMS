package Group3;

public class SegregateCharNosSpcl {

	public static void main(String[] args) {
		String s="hgfghf12345#$&^";
		String alp="";
		String num="";
		String spch="";
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)>=65 && s.charAt(i)<=90 || s.charAt(i)>=97 && s.charAt(i)<=122) 
			{
				alp=alp+s.charAt(i);
			}
			else if(s.charAt(i)>=48 && s.charAt(i)<=57)
			{
				num=num+s.charAt(i);
			}
			else
			{
				spch=spch+s.charAt(i);
			}
			/*
			if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z') 
			{
				alp=alp+s.charAt(i);
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				num=num+s.charAt(i);
			}
			else
			{
				spch=spch+s.charAt(i);
			}
			*/
		}
		System.out.println("Characters     numbers        spcharacters ");

		System.out.println(alp+"             "+num+"            "+spch+" ");
		

	}

}
