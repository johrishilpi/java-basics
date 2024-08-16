package shilpi.assignment;

import java.util.Scanner;

public class Day14_Scanner_program {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter number value limit is -128 to 127");
		byte b1=s1.nextByte();
		System.out.println("Enter number value limit is -32768 to 32767 ");
		short s2=s1.nextShort();
		System.out.println("Enter any number");
		int i1=s1.nextInt();
		System.out.println("Enter any number");
		long l1=s1.nextLong();
		
		System.out.println("Enter decimal number upto 3 decimal palces");
		float f1=s1.nextFloat();
		System.out.println("Enter any decimal number");
		double d1=s1.nextDouble();
		System.out.println("Enter True or False");
		boolean b=s1.nextBoolean();
		System.out.println("Enter any String");
		String s3=s1.next();
		

	}

}
