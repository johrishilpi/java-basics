package assignments;

import java.util.Arrays;

public class String_count_test_question {

	public static void main(String[] args) {
		String name="world is full of beautiful people";
		char [] c=name.toCharArray();
		System.out.println(Arrays.toString(c));
		int count_of_alpha=0;
		for(int i=0;i<name.length();i++)
		{
			boolean b=Character.isAlphabetic(c[i]);
			if(b==true)
			{
				count_of_alpha++;
			}
		}
		System.out.println("The no. of alphabets in "+name+" is: "+count_of_alpha);
		System.out.println("");
		Arrays.sort(c);
		for(int i=0;i<name.length();i++)
		{
			System.out.print(c[i]);
		}

	}

}
