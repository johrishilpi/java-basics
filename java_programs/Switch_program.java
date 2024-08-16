package java_programs;

import java.util.Scanner;

public class Switch_program {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Press 1 for Chrome Browser ");
		System.out.println("Press 2 for edge Browser ");
		System.out.println("Press 3 for safari Browser ");
		System.out.println("Press 4 for IE Browser ");
		int a=s1.nextInt();
	switch(a)
	{case 1:
		System.out.println("Chrome Browser");
		break;
	case 2:
		System.out.println("edge Browser");
		break;
	case 3:
		System.out.println("safari Browser");
		break;
	case 4:
		System.out.println("internet explorer");
		break;
		
		default:
			System.out.println("Please enter number 1 to 4");


	
	}

	}

}
