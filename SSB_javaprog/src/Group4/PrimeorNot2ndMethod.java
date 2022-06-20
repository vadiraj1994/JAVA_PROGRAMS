package Group4;

public class PrimeorNot2ndMethod {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//int n = sc.nextInt();
		int a[]= {2,3,4,5,6,7,8,9,10,11};
		
		for(int i=0;i<a.length;i++)
		{
			int n = a[i];
			int m=2;
			while(n>=m)
			{
				if(n%m==0)
				{
					break;
				}
				else
				{
					m++;
				}
			}
			if(n==m)
			{
			System.out.print(n+" ");
			}
		}
     }
}

