package assignments;

import java.util.Arrays;

public class Q {

	public static void main(String[] args) {
	String a="world is full of beautiful people";
	int count_of_alpha=0;
	
	char [] b=a.toCharArray();
	System.out.println(b.length);
	System.out.println(a.length());
	System.out.println(Arrays.toString(b));
	
	for(int i=0;i<a.length();i++)// i<b.length (Array length can also be used)
	{
		boolean n=Character.isAlphabetic(b[i]);
		if(n==true)
		{
		count_of_alpha++;
		}	
	}
	System.out.print("The alphabet count in "+a+" is:"+count_of_alpha);	
	Arrays.sort(b);
	System.out.println("");
	System.out.println(b);
	//System.out.println("");
	//for(int i=0;i<a.length();i++)
	//{
		//System.out.print(b[i]);
	//}
	
  
	}

}
