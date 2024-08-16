
package assignments;

import java.util.Arrays;

public class A45_number_of_alphabets_numbers_space_SPcharacters {

	public static void main(String[] args) {
	String a="Shilpi Johri 123 *%^$#";
	int alpha_count=0;
	int num_count=0;
	int space_count=0;
			
	char [] b=a.toCharArray();
	System.out.println(Arrays.toString(b));
	for(int i=0;i<a.length();i++)
	{
		boolean d=Character.isAlphabetic(b[i]);
		boolean e=Character.isDigit(b[i]);
		boolean f=Character.isWhitespace(b[i]);
		if(d==true)
		{
		
			alpha_count++;
		}
		
		if(e==true)
		{
			num_count++;
		}
		if(f==true)
		{
			space_count++;
		}
	}
	
	System.out.println("The number of alphabets are: "+alpha_count);	
	System.out.println("The number of numerals are: "+num_count);
	System.out.println("The number of spaces are: "+space_count);
	int special_characters=a.length()-(alpha_count+num_count+space_count);
	System.out.println("The number of Special characters are: "+special_characters);
	}

}
