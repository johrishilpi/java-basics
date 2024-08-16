package java_programs;

import java.util.Arrays;

public class Arrays_number_add {

	public static void main(String[] args) {
int [] a=new int[3];
a[0]=8;
a[1]=3;
a[2]=6;
System.out.println(Arrays.toString(a));
int sum=a[0]+a[1]+a[2];
System.out.println(sum);
int summation=0;
for(int i=0;i<3;i++)
{
	summation=summation+a[i];
}
System.out.println(summation);
	}

}
