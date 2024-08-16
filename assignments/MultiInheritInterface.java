package assignments;
interface Google1
{
	void loginthrough_google_auth();
	void logoutthrough_google_auth();
}
interface Facebook1 extends Google1
{
	void loginthrough_facebook_auth();
	void logoutthrough_facebook_auth();
}
public class MultiInheritInterface implements Facebook1
{public void loginthrough_google_auth() 
{
System.out.println("Login through google auth");
	
}
public void logoutthrough_google_auth() {

	System.out.println("Logout through google auth");
	
}
public void loginthrough_facebook_auth() {

	System.out.println("Login through facebook auth");
}
public void logoutthrough_facebook_auth() {
	System.out.println("Logout through facebook auth");
	
}
	public static void main(String[] args) 
	{
MultiInheritInterface a1=new MultiInheritInterface();
a1.loginthrough_google_auth();
a1.logoutthrough_google_auth();
a1.loginthrough_facebook_auth();
a1.logoutthrough_facebook_auth();

	}

	
}
