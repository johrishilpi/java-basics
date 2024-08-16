package practice.programs;

import java.util.Arrays;

public class Count_Alpha {

	public static void main(String[] args) {
	String str="S Johri 1234 %&****#";
	char [] c=str.toCharArray();
	String strlc=str.toLowerCase();
	int alpha_count=0;
	int num_count=0;
	int space_count=0;
	int len=str.length();
	for(int i=0;i<len;i++)
	{
		boolean b=Character.isAlphabetic(c[i]);
				if(b==true)
				{
					alpha_count=alpha_count+1;
				}
		boolean b1=Character.isDigit(c[i]);
		if (b1==true)
		{
			num_count=num_count+1;
		}
		boolean b2=Character.isWhitespace(c[i]);
		if(b2==true)
		{
			space_count=space_count+1;
		}
	}
	System.out.println("Count of Alphabets is : "+alpha_count);
	System.out.println("Count of Numbers is : "+num_count);
	System.out.println("Count of Spaces is : "+space_count);
	int sum=alpha_count+num_count+space_count;
	int spechar=len-sum;
	System.out.println("Count of Special characters is : "+spechar);
	Arrays.sort(c);
	System.out.println(c);
	

	}

}
