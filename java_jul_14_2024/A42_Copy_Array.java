package java_jul_14_2024;

import java.util.Arrays;

public class A42_Copy_Array {

	public static void main(String[] args) {
	int [] input=new int[3];
	input[0]=23;
	input[1]=89;
	input[2]=93;	
	System.out.println("The input Array is:"+Arrays.toString(input));
	int [] output=new int[3];
	for(int i=0;i<3;i++)
	{
		output [i]=input[i];
	}
	System.out.println("The Copied output Array is:"+Arrays.toString(output));

	}

}
