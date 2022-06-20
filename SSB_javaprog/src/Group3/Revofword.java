package Group3;

import java.util.LinkedHashSet;

public class Revofword {

	public static void main(String[] args) {
		String s="Welcome to TYSS bangalore";
		String[] str = s.split(" ");
		//Step1: remove the duplicate
		LinkedHashSet<String> set=new LinkedHashSet<>();
		for (int i = str.length-1; i >=0 ; i--) {
			System.out.print(str[i]+" ");
			
		}

	}

}
