package practice.programs;

import java.util.Arrays;

public class Anagram_practice {

	public static void main(String[] args) {
		String str1="earth";
		String str2="heart";
		char [] c1=str1.toCharArray();
		char [] c2=str2.toCharArray();
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		boolean b=Arrays.equals(c1, c2);
		System.out.println(b);
		if(b==true)
		{
			System.out.println(str1 +" and "+ str2+ " are Anagrams" );
		}
		else
		{
			System.out.println(str1 +" and "+ str2+ " are not Anagrams" );
		}

	}

}
