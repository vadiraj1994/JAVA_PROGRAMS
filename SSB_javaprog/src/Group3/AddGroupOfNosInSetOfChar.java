package Group3;

public class AddGroupOfNosInSetOfChar {

	public static void main(String[] args) {
		String s="a11b22c33";
		int num=0;//1
		int sum=0;
	
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')//1
				{
				int n=s.charAt(i)-48;//1(49)-48=1
				num=num*10+n;//0*10+1=1
				}
		    else
				{
		    	sum=sum+num;
		    	num=0;	
				}
		}
		System.out.print(sum+num);
}
}
