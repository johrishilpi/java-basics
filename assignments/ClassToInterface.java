package assignments;
interface Google_Auth//achieve 100% abstraction
{
	void login();//Abstract method
	void logout();//Abstract method
}
public class ClassToInterface implements Google_Auth
{
	public static void main(String[] args) 
	{
		ClassToInterface a1=new ClassToInterface();
		a1.login();
		a1.logout();
	}
	public void login() {
		System.out.println("Overridden login Abstract method from interface");	
	}
	public void logout() {
		System.out.println("Overridden logout Abstract method from interface");
		
	}

}
