package Group3;

public class RevofwordUsingSplit {

	public static void main(String[] args) {
		String s="Welcome to TYSS";
		String[] str = s.split(" ");

		for (int i = str.length-1; i >=0 ; i--) 
		{
			System.out.print(str[i]+" ");

		}

	}

}
