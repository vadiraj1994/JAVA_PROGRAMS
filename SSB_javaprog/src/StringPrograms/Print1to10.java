package StringPrograms;

public class Print1to10 {

	public static void num(int n)
	{
		if(n<=10) 
		{
			System.out.println(n);
			num(n+1);
		}
	}
	public static void main(String[] args) {
	
		Print1to10 p=new Print1to10();
		p.num(1);
	}
}
