package practice.programs;

import java.util.Arrays;

public class Palindrome_practice {

	public static void main(String[] args) {
	String str="malayalam";
	String reversestr="";
	char [] c=str.toCharArray();
	System.out.println(Arrays.toString(c));
	for(int i=str.length()-1;i>=0;i--)
	{
		reversestr=reversestr+c[i];
	}
	System.out.println(reversestr);
	boolean b=str.equals(reversestr);
	System.out.println(b);
	if(b==true)
	{
		System.out.println(str+ " is a Palindrome.");
	}
	else
	{
		System.out.println(str+ " is not a Palindrome.");	
	}
	}

}
