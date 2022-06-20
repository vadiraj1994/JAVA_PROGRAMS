package Assignmnt;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n = sc.nextInt();
	int fib1=0;
	int fib2=1;
	int fib3=0;
	System.out.println("<== fibonacci series upto 25==>");
	for(int i=fib3;fib3<=n;i++)
	{
		System.out.print(fib3+" ");
		fib1=fib2;
		fib2=fib3;
		fib3=fib1+fib2;
	
	}
}
}

