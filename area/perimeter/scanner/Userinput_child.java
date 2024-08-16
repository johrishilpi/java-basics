package area.perimeter.scanner;

import java.util.Scanner;

public class Userinput_child extends Father_area_peri
{

	public static void main(String[] args) 
	{
	
	Scanner sc1=new Scanner(System.in);
	System.out.println("Enter 1 for circle");
	System.out.println("Enter 2 for square");
	System.out.println("Enter 3 for rectangle");
	System.out.println("Enter 4 for triangle");
	System.out.println("Enter 5 for trapezium");
	int a=sc1.nextInt();
	if(a==1)
	{
		circle();
		System.out.println("Thank you for using our area and perimeter calculator!");
	}
		
		else if(a==2)
		{
			square();
			System.out.println("Thank you for using our area and perimeter calculator!");
		}
		else if(a==3)	
		{
		   rectangle();
		   System.out.println("Thank you for using our area and perimeter calculator!");
		}
		else if(a==4)
		{
			triangle();
			System.out.println("Thank you for using our area and perimeter calculator!");
		}
		else if(a==5)
		{
			trapezium();
			System.out.println("Thank you for using our area and perimeter calculator!");
		}
		
		else
		{
			System.out.println("This is an invalid entry.Please try again!");
			
	}
	

	
	}

}
