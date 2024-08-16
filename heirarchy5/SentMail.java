package heirarchy5;

public class SentMail extends Super_login_logout
{

	
	static void Send()
	{
		 System.out.println("Send Mail");
	}
	
	public static void main(String[] args)
	{
		login();
		 Send();
		 logout();

	}

}
