package learnjava;


class Top
{
	void Grandparent()
	{
		System.out.println("I am the Grandparent");
	}
}

abstract class AbstractMiddle extends Top
{
	abstract void Parentandchild();
}

public class Abstract_Parent_multilivelinheritance extends AbstractMiddle
{
	@Override
	void Parentandchild() 
	{
		System.out.println("I am an Abstract class.I am a Parent and a child");
		
	}
	
	void childest()
	{
	System.out.println("I am the childest class");

	}
		
	public static void main(String[] args) 
	{ Abstract_Parent_multilivelinheritance a1=new Abstract_Parent_multilivelinheritance();
	a1.Grandparent();
	a1.Parentandchild();
	a1.childest();
	
			}

	}
