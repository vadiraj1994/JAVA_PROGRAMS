package Group3;

public class PosEachChar {

	public static void main(String[] args) 
	{
		//input="aabbca"; and output="a2b2c1a1"
		String s="aabbca";
		for (int i = 0; i < s.length(); i++) 
		{			
			int count=1;//count always start from '1' for every iteration  of 'for' loop
			
			for (int j = i+1; j < s.length(); j++) 
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
					i++;//*in order to avoid repetition of the same char otherwise we get "a2a1b2b1c1a1"
				}
				else
				{
					break;
				}
			}
		System.out.print(s.charAt(i)+""+count);
		}
	}

}
