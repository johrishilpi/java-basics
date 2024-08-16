package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class A39_Array_Scanner_double {

	public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	double [] d=new double[3];
	for(int i=0;i<3;i++)
	{
		System.out.println("Enter Decimal Value of index "+i);	
		d[i]=s1.nextDouble();
	}
	
	System.out.println(Arrays.toString(d));
	}

	
}
