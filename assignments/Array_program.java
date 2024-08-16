package assignments;

import java.util.Arrays;

public class Array_program {

	public static void main(String[] args) {
	String [] name=new String[4];
	name[0]="Shilpi";
	name[1]="Mugu";
	name[2]="Daivik";
	name[3]="Devanshi";

	System.out.println(Arrays.toString(name));
	
	for(int i=0;i<4;i++)
	{
		System.out.println(name[i]);
	}
	String [] name1=new String[4];
	name1[0]="Shilpi";
    name1[1]="Mugu";
	name1[2]="Daivik";
	name1[3]="Devanshi";
	
	
	int[] rollno=new int[5];
	rollno[0]=16;
	rollno[1]=17;
	rollno[2]=18;	
	rollno[3]=19;		
	rollno[4]=20;
	System.out.println(Arrays.toString(rollno));
	}

}
