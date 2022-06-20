package Program;

public class Bubblesort_1stMin2ndMin {

	public static void main(String[] args) {
		int a[]= {16,2,7,5,4,3,-1};
		int fmin=a[0];
		int smin=a[0];
		for (int i = 0; i < a.length; i++) 
		{
					
			if(a[i]<fmin)
			{
				if(a[i]!=fmin)
				{
				smin=fmin;
				}
			fmin=a[i];
			}
		else if(a[i]<smin)
			{
				smin=a[i];
			}
			
		}

		System.out.println(fmin+" "+smin);
	}
			
}
