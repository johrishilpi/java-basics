package java_programs;

import java.util.Arrays;
import java.util.Scanner;

public class String_Reversal_User_defined_scanner {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter your string to be reversed");
		String name=s1.nextLine();
		char [] b=name.toCharArray();
		char [] c=new char[name.length()];
		System.out.println(Arrays.toString(b));
		int j=0;
		for(int i=name.length()-1;i>=0;i--)
		{
			c[i]=b[j];
			j++;
			
		}
		System.out.println(Arrays.toString(c));

	}

}
