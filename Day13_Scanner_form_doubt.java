package shilpi.assignment;
import java.util.Scanner;
public class Day13_Scanner_form_doubt {
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("Please enter your information");
	System.out.println("Enter your First Name");
	String firstname=s1.nextLine();
	System.out.println("My First Name is:"+firstname);
	System.out.println("Enter your Last Name");
	String lastname=s1.nextLine();
	System.out.println("My last Name is:"+lastname);
	System.out.println("Enter E-mail ID");
	String email=s1.nextLine();
	System.out.println("My E-mail ID is:"+email);
	System.out.println("Password");
	String password=s1.nextLine();
	System.out.println("Gender-Please enter");
	System.out.println("M for Male");
	System.out.println("F for Female");
	System.out.println("C for Custom");
	String gender=s1.nextLine();
	System.out.println("Enter your Present address");
	String presentaddress=s1.nextLine();
	System.out.println("My Present address is:"+ presentaddress +".");
	System.out.println("Permanent address");
	String peradd=s1.nextLine();
	System.out.println("My Permanent address is:"+ peradd +".");
	System.out.println("Pincode");
	String pc=s1.nextLine();
	System.out.println("My Pincode is:"+pc+".");
	System.out.println("Thank you for filling up your information");

}
	
	
}
