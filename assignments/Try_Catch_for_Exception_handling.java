package assignments;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch_for_Exception_handling {

	public static void main(String[] args) {
		try
		{
	System.out.println("Enter the Array size");// this program finds the sum of all but the
	//last number in the array and divides the sum with the last number entered in the array.
	Scanner s1=new Scanner(System.in);
	int d=s1.nextInt();
	double[] a=new double[d];
	for(int i=0;i<d;i++)
	{
		System.out.println("Enter the value number "+(i+1));
		a[i]=s1.nextDouble();
	}

double sum=0;
	for(int i=0;i<(d-1);i++)
	{
	sum=sum+a[i];
	}
	System.out.println(sum);
    System.out.println("The sum of first "+(d-1)+" numbers is: "+sum);
	double div=sum/a[d-1];
	System.out.println("The answer of "+sum+"/"+a[d-1]+ " = " + div);
	s1.close();
	
	}
		catch(InputMismatchException a)
		{
	  System.out.println("Exception handling successful for InputMismatch Exception");
		}
		catch (ArithmeticException a)
		{
			 System.out.println("Exception handling successful for Arithmetic Exception");
		}
	finally
	{
		System.out.println("Thank you");
	}
		
}
}


