package assignments;


public class Palindrome_practice {

	public static void main(String[] args) {
	String a="dad";
	String out="";

	int len= a.length();
	for (int i=len-1 ;i>=0;i--)
	{
		out=out+(a.charAt(i));
	}
System.out.println(out);
boolean pal=a.equalsIgnoreCase(out);
if(pal==true)
{
	System.out.println(a + " is a palindrome");
		
}
else
{
	System.out.println(a + " is not a palindrome");
}
	}

}
