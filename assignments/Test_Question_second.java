package assignments;

import java.util.Arrays;

public class Test_Question_second {

	public static void main(String[] args) {
	String name="world is full of beautiful people";
	char [] a=name.toCharArray();
	System.out.println(Arrays.toString(a));
	int j=0;
	int count=0;
	int u=name.length();
	System.out.println(u);
	for(int i=0;i<u;i++)
	{
		boolean h=Character.isAlphabetic(a[i]);

		
if(h==true)
{
	count++;
}
System.out.println(count);

	}

	
}
}
