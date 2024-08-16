package practice.programs;

import java.util.Arrays;

public class Resverse_copy_Array {

	public static void main(String[] args) {
	int [] a= {12,24,26,48,60};
	System.out.println(Arrays.toString(a));
	int [] b=new int[a.length];
	int j=0;
	for(int i=a.length-1;i>=0;i--)
	{
		b[j]=a[i];
		j++;
	}
System.out.println(Arrays.toString(b));
	}

}
