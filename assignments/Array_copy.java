package assignments;

import java.util.Arrays;

public class Array_copy {

	public static void main(String[] args) 
	{
    int [] first= {1,5,8,9,7};
    int [] second=new int [5];
    for(int i=0;i<5;i++)
    {
    	second[i]=first[i];
    }
System.out.println(Arrays.toString(second));
	}

}
