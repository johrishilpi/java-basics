package shilpi.assignment;
import java.util.Scanner;

public class Day13_Scanner_form {

	public static void main(String[] args) {
Scanner s1=new Scanner(System.in);
System.out.println("Please enter your information");
System.out.println("First Name");
String firstname=s1.next();
System.out.println("Last Name");
String lastname=s1.next();
System.out.println("E-mail");
String email=s1.next();
System.out.println("Password");
String password=s1.next();
System.out.println("Gender-Please enter");
System.out.println("M for Male");
System.out.println("F for Female");
System.out.println("C for Custom");
String gender=s1.next();
System.out.println("Present address");
String presentaddress=s1.next();
System.out.println("Permanent address");
//Scanner s2=new Scanner(System.in);
String peradd=s1.next();
System.out.println("Pincode");
//Scanner s3=new Scanner(System.in);
String pc=s1.next();
System.out.println("Thank you for filling up your information");
	}

}
