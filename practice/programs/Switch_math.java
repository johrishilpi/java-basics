package practice.programs;

import java.util.Scanner;

public class Switch_math {

	public static void main(String[] args) 
	{ Scanner s1=new Scanner(System.in);
	System.out.println("Enter 1 for Addition");
	System.out.println("Enter 2 for Subtraction");
	System.out.println("Enter 3 for Multiplication");
	System.out.println("Enter 4 for Division");
	int userinput=s1.nextInt();
	System.out.println("Enter the first number");
	  double fn=s1.nextDouble();
	  System.out.println("Enter the second number"); 
	  double sn=s1.nextDouble();
	switch(userinput)
	{
	case 1:
		double a=fn+sn;
		System.out.println("The answer is : "+a);
		break;
		
	case 2:
		double s=fn-sn;
		System.out.println("The answer is : "+s);
		break;
	case 3:	
		double m=fn*sn;
		System.out.println("The answer is : "+m);
		break;
	case 4:	
		double d=fn/sn;
		System.out.println("The answer is : "+d);
		break;
	default: 
		System.out.println("Please enter the correct choice 1-4");
		
	}

	}

}
