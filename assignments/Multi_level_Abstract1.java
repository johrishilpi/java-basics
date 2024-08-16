package assignments;
abstract class AbstractParent3
{
	abstract void add();
	abstract void subract();
}
abstract class Parent3 extends AbstractParent3
{
	void login_logic()
	{
		System.out.println("login logic");
	}
	static void logout_logic()
	{
		System.out.println("logout logic");
	}
}
public class Multi_level_Abstract1 extends Parent3
{
	void voice_chat()
	{
		System.out.println("chatting via voice");
	}
static void video_chat()
     {
	System.out.println("chatting via video");
     
     }
@Override
void add() {
	System.out.println("override add method");
	// here the overriding methods are in the child class and not in the parent class
	//so we make the parent class abstract with only concrete methods in it
}
@Override
void subract() {
	System.out.println("override subtract method");
	// here the overriding methods are in the child class and not in the parent class
		//so we make the parent class abstract with only concrete methods in it
}
	public static void main(String[] args)
	{
		Multi_level_Abstract1 m1=new Multi_level_Abstract1();
		m1.voice_chat();
		video_chat();
		m1.add();
		m1.subract();
		m1.login_logic();
		logout_logic();
		
}
}

