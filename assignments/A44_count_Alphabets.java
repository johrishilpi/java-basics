package assignments;

import java.util.Arrays;

public class A44_count_Alphabets {

	public static void main(String[] args) 
	{
		int count_of_alpha=0;
		String name="Name123";
		String cents="50cents";
		char [] b=name.toCharArray();
		char [] c=cents.toCharArray();
		System.out.println(Arrays.toString(b));
		for(int i=0;i<name.length();i++)
		{
			boolean n=Character.isAlphabetic(b[i]);
			if(n==true)
			{
			count_of_alpha++;
			}	
		}
		System.out.print("The alphabet count in "+name+" is:"+count_of_alpha);	
		System.out.println("");
		System.out.println(Arrays.toString(c));
		int count=0;
		
		for(int i=0;i<cents.length();i++)
			
		{boolean m=Character.isAlphabetic(c[i]);
			if(m==true) 
			{
			count++;
			}
		
	}
		System.out.println("The alphabet count in "+cents+" is:"+count);
	}
}