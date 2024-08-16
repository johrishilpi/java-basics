package assignments;
abstract class AbstractParent2
{
	abstract void add();
	abstract void subract();
}

class Parent1 extends AbstractParent2
{
	void login_logic()
	{
		System.out.println("login logic");
	}
	static void logout_logic()
	{
		System.out.println("logout logic");
	}
	
	void add() {
		System.out.println("override add method");
	// here the overriding methods are in the parent class	
	}
	void subract() {
		System.out.println("override subtract method");
		// here the overriding methods are in the parent class	
	}
}
public class Multi_level_Abstract extends Parent1
{
	void voice_chat()
	{
		System.out.println("chatting via voice");
	}
static void video_chat()
     {
	System.out.println("chatting via video");
     
     }
	public static void main(String[] args)
	{
		Multi_level_Abstract m1=new Multi_level_Abstract();
		m1.voice_chat();
		video_chat();
		m1.login_logic();
		logout_logic();
		m1.add();
		m1.subract();

	}

}
