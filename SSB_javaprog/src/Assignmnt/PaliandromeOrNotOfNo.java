package Assignmnt;

import java.util.Scanner;

public class PaliandromeOrNotOfNo 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x = sc.nextInt();
		getint(x);
	}
		public static void getint(int n) {
		int rev=0;
		int copy=n;
		while(n!=0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;	
		}
		if(rev==copy) {
			System.out.println(rev+"==> its a paliandrome");
		}
		else {
			System.out.println(rev+"==>its not a paliandrome");
		}
	}
	
}
