package assignments;
abstract class combination
{
	abstract void add();
	abstract void sub();
	static void mul()
	{
		System.out.println("I am a concrete static method in the abstract class");
	}
	 void div()
	{
		 System.out.println("I am a concrete non static method in the abstract class");
	}
	}
public class A34_Abstract extends combination
{   static void childmul()
	{
	System.out.println("I am a concrete static method in the child class");
	}
void childdiv()
{
	System.out.println("I am a concrete non static method in the child class");
}
@Override
void add() 
{
	System.out.println("I am the overridden method add");
	
}
@Override
void sub() 
{
	System.out.println("I am the overridden method sub");
	
}
	public static void main(String[] args)
	{
		A34_Abstract a1=new A34_Abstract();
		combination.mul();//static method in the parent abstract class called directly using
		                 //classname.methodname
		a1.div();//non static method in the parent abstract class called using rv
		childmul();
		a1.childdiv();
		a1.add();
		a1.sub();
	}
}
