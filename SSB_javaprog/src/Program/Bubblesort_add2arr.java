package Program;

public class Bubblesort_add2arr {

	public static void main(String[] args) {
		int a[]= {4,5,1,-1};
		int b[]= {4,2,3};
		int count=a.length;
		if(a.length<b.length)
		{
				//5<4
			count=b.length;//
		}
		for (int i = 0; i < count; i++) 
		{
			try {
				System.out.println(a[i]+b[i]);
			}catch(Exception e)
			{
				if(a.length>b.length)
				{
					System.out.println(a[i]);
				}
				else {
					System.out.println(b[i]);
				}
			}
			
		}
		
	}
}
