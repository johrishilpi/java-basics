package practice.programs;

import java.util.Arrays;

public class Copy_Array {

	public static void main(String[] args) {
	int [] a= {12,24,36,48,60};
	System.out.println(Arrays.toString(a));
	int [] b= new int[a.length];
	for(int i=0;i<a.length;i++)
	{
		b[i]=a[i];
	}
	System.out.println(Arrays.toString(b));

	}

}
