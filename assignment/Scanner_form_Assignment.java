package shilpi.assignment;

import java.util.Scanner;

public class Scanner_form_Assignment {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("First Name");
		String firstname=s1.nextLine();
		System.out.println("Last Name");
		String lastname=s1.nextLine();
		System.out.println("E-mail");
		String email=s1.nextLine();
		System.out.println("Password");
		String password=s1.nextLine();
		System.out.println("Gender-Please enter");
		System.out.println("M for Male");
		System.out.println("F for Female");
		System.out.println("C for Custom");
		String gender=s1.nextLine();
		System.out.println("Present address");
		String presentaddress=s1.nextLine();
		System.out.println("Permanent address");
		String peradd=s1.nextLine();
		System.out.println("Pincode");
		String pc=s1.nextLine();
		System.out.println("Thank you for filling up your information");


	}

}
