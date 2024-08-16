package java_programs;

import java.util.Scanner;

interface Simple_interest
{
 void simple_int();
}
interface Compound_interest
{
void compound_int();
}

public class Multiple_level_inheritance implements Simple_interest,Compound_interest
{ static Scanner s1= new Scanner(System.in);
  
	public static void main(String[] args) 
	{
		
		System.out.println("Enter 1 for Simple interest");
		System.out.println("Enter 2 for Compound interest");
		int a=s1.nextInt();
		Multiple_level_inheritance m1=new Multiple_level_inheritance();
		if(a==1)
		{
			m1.simple_int(); 	
		}
		else if( a==2)
		{
			m1.compound_int();
		}
		else
		{
			System.out.println("This is an invalid entry");
		}
	}

	public void compound_int() 
	{
		System.out.println("Enter amount invested");
		double p=s1.nextDouble();
		System.out.println("Enter % interest rate as a number example: 10 for 10%, "
				+ "20 for 20%");
		double r=s1.nextDouble();
		System.out.println("Enter time period of investment in terms of number of years");
		double t=s1.nextDouble();
		double c=r*0.01;
		
		System.out.println("Enter number of times the interest is credited:");
		System.out.println("Enter 1 for annually");
		System.out.println("Enter 2 for every 6 months(biannually)");
		System.out.println("Enter 4 for Quarterly");
		System.out.println("Enter 12 for monthly");
		double n=s1.nextDouble();
		double d=(c/n);
	    double rate=1+d;
	    double amt=p*(Math.pow(rate,(t*n)));
		double interest=amt-p;
		double roundamt=Math.round(amt*100);
		double finalamt=roundamt/100;
		double roundinterest=Math.round(interest*100);
		double finalinterest=roundinterest/100;
        System.out.println("Your accumulated amount on an investment of $"+p+" after "+t+" years will be $"+finalamt);
		System.out.println("You will earn $"+finalinterest+" on your investment of $"+p);
		
	}

	public void simple_int()
	{
		System.out.println("Enter amount invested");
		double p=s1.nextDouble();
		System.out.println("Enter % interest rate as a number example: 10 for 10%, "
				+ "20 for 20%");
		double r=s1.nextDouble();
		System.out.println("Enter time period of investment in terms of number of years");
		double t=s1.nextDouble();
		double si=(p*r*t)/100;
		double amt=p+si;
		 System.out.println("Your accumulated amount on an investment of $"+p+" after "+t+" years will be $"+amt);
		 System.out.println("You will earn $"+si+" on your investment of $"+p);
		
		
	}

}
