package java_jul_14_2024;

import java.util.Arrays;

public class A43_Reverse_the_array {

	public static void main(String[] args)
	{
		int [] a=new int[3];
		int [] b=new int[3];
		a[0]=12;
		a[1]=54;
		a[2]=89;
		System.out.println("The input array is:"+Arrays.toString(a));
		int j=0;
		for(int i=a.length-1;i>=0;i--)
		{
			b[j]=a[i];
			j++;
		}
		System.out.println("The reverse output Array is:"+Arrays.toString(b));
	}

}
