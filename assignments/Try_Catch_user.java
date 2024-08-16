package assignments;

import java.util.Scanner;

public class Try_Catch_user {

	public static void main(String[] args) {
		System.out.println("Enter the Array size");// this program finds the sum of all but the
		//last number in the array and divides the sum with the last number entered in the array.
		Scanner s1=new Scanner(System.in);
		int d=s1.nextInt();
		int[] a=new int[d];
		for(int i=0;i<d;i++)
		{
			System.out.println("Enter the value number "+(i+1));
			
			a[i]=s1.nextInt();
		}
System.out.println(d);
		int summation=0;
			for(int i=0;i<3;i++)
			{
			summation=summation+a[i];
			}
			System.out.println(summation);

	}


}
