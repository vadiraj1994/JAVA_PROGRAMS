package StringPrograms;

public class Closetozero {

	public static void main(String[] args) 
	{
	int a[]= {5,8,-7,8,6,1};
	int sum=a[0]+a[1];
	for (int i = 0; i < a.length; i++) 
	{
		for (int j = 0; j < a.length; j++) 
		{
		if(i!=j)
		{
			int temp=a[i]+a[j];
			if(temp>=0 && temp<sum) 
			{
				sum=temp;
			}
		}
	   }	
	}
	System.out.println(sum);
}

}
