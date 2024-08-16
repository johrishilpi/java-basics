package learnjava;

import java.util.Arrays;

public class Anagram_program {

	public static void main(String[] args) {
	String a="race";
	String b="care";
	char [] c=a.toCharArray();
	char [] d=b.toCharArray();
	System.out.println(Arrays.toString(c));
	System.out.println(Arrays.toString(d));
	Arrays.sort(c);
	Arrays.sort(d);
	System.out.println(Arrays.toString(c));
	System.out.println(Arrays.toString(d));
	boolean e=Arrays.equals(c, d);
	if(e==true)
	{
		System.out.println(a+" and "+b+" are anagrams");
	}
	else
	{
		System.out.println(a+" and "+b+" are not anagrams");
	}
	

	}

}
