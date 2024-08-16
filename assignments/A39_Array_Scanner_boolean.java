
package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class A39_Array_Scanner_boolean {

	public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	boolean [] b= new boolean[3];
	for(int i=0;i<3;i++)
	{
		System.out.println("Enter True or False for index "+i);
		b[i]=s1.nextBoolean();
	}
	
	System.out.println(Arrays.toString(b));

	}

}
