package java_jul_14_2024;

public class A41_Palindrome {

	public static void main(String[] args) 
	{
		String input="Radar";
		char [] b=input.toCharArray();
		String output="";
		System.out.println(b);
		for(int i=input.length()-1;i>=0;i--)	
		{
			output=output+(input.charAt(i));
		}
	
	System.out.println(output);
	boolean c=input.equalsIgnoreCase(output);
	if(c==true)
	{
		System.out.println(input+" is a Palindrome");
	}
	else
	{
		System.out.println(input+" is not a Palindrome");	
	}
	}

}
