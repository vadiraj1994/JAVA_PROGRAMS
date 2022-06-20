package Program;

public class Bubblesort_1stMaxcop {

	public static void main(String[] args) {
		int a[]= {6,8,5,2,4,3};
		int max=a[0];
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}	
		}
		System.out.println(max);
	}
}
