package heirarchy5;

public class Inbox extends Super_login_logout
{

	static void Inb()
	{
		 System.out.println("Inbox");
	}
	
	void add()
	{
		System.out.println("Shilpi");
		super.add();
	}
	
	public static void main(String[] args) 
	{
		login();
		 Inb();
		 logout();
		 Inbox i1=new Inbox();
		 i1.add();

	

	}

}
