package assignments;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Nested_try_catch {

	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		try
		{ 
		System.out.println("Enter Mobile number:");
		long a=s1.nextLong();
		System.out.println("Your Mobile number is: "+a);
		
		}
		catch(InputMismatchException a)
		{
			System.out.println("Invalid Entry. Please enter a valid Mobile no.");
			Scanner s2=new Scanner(System.in);
			try
			{
				long b= s2.nextLong();
				System.out.println("Your Mobile number is: "+b);
			}
			catch(InputMismatchException b)
			{
				System.out.println("This is your last try.Please enter a valid Mobile number");
				Scanner s3= new Scanner(System.in);
				try
				{
					long f=s3.nextLong();
					System.out.println("Your Mobile number is: "+f);
				}
				catch(InputMismatchException d) 
				{
					
				}
		
			}
			}
		
		finally
		{
			System.out.println("Thank you");
		}

}
}