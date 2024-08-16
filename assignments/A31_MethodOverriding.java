 package assignments;
class Methodoverriding
{
	void login()//Suppressed or it has been overridden
{
	System.out.println("e-mail");
}
	
}
public class A31_MethodOverriding extends Methodoverriding
{
void login()
{
	
	System.out.println("mobile");
	super.login();
}
	
	public static void main(String[] args) 
	{
		A31_MethodOverriding a1= new A31_MethodOverriding();
		a1.login();

	}

}
