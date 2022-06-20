package Assignmnt;

public class PrimeorNot {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//int n = sc.nextInt();
		int a[]= {2,3,4,5,6,7,8,9,10,11};
		
		for(int i=0;i<a.length;i++)
		{
			int n = a[i];//2
			boolean flag = true;
		for (int j = 2; j < n; j++)
		{
			if(n%j==0)
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
}

