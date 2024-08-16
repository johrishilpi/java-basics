package assignments;
interface Google
{
	void loginthrough_google_auth();
	void logoutthrough_google_auth();
}
interface Facebook extends Google
{
	void loginthrough_facebook_auth();
	void logoutthrough_facebook_auth();
}
public class Shilpiinterface  implements Facebook                                 
{

	public static void main(String[] args) {
	

	}

	public void loginthrough_google_auth() 
	{
		
	}
	public void logoutthrough_google_auth() 
	{
		
	}
	public void loginthrough_facebook_auth() 
	{
		
	}
	public void logoutthrough_facebook_auth() 
	{
		
	}

}
