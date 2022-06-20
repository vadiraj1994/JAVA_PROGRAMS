package Program;

public class Bubblesort_1stMax2ndMax {

	public static void main(String[] args) {
		int a[]= {2,1,5,2,4,3,3};
		int fmax=a[0];
		int smax=a[0];
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]>=fmax)
			{
				if(a[i]!=fmax)
				{
				smax=fmax;
				}
				fmax=a[i];
			}
			else if(smax==fmax || a[i]>smax)                    
			{
				smax=a[i];
			}
		}
		System.out.println(fmax+" "+smax);
	}
			
}
