package Program;

public class Bubblesort_1stMincop {

	public static void main(String[] args) {
		int a[]= {6,8,5,2,4,3};
		int fmin=a[0];
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]<fmin)
			{
				fmin=a[i];
			}	
		}
		System.out.println(fmin);
	}
}
