package practice.programs;

import java.util.ArrayList;

public class Array_odd_even {

	public static void main(String[] args) {
	int [] a= {2,3,5,6,7,8};
	ArrayList even=new ArrayList();
	ArrayList odd=new ArrayList();
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			even.add(a[i]);
		}
		else
		{
			odd.add(a[i]);
		}
		
	}
	System.out.println("Even numbers are : "+ even);
	System.out.println("Odd numbers are : "+ odd);
	}

}
