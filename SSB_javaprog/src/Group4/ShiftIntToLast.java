package Group4;

public class ShiftIntToLast {

	public static void main(String[] args) {
	int a[]= {1,2,3};
	int key=1;
	for (int k = 0; k < key; k++) 
	{
		int temp=a[0];//1
		for (int i = 1; i < a.length; i++) 
		{
			a[i-1]=a[i];//2, 3
		}
		a[a.length-1]=temp;//1
	}
	for (int i = 0; i < a.length; i++) 
	{
		System.out.print(a[i]+",");
	}

}

}
