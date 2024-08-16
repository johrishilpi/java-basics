package learnjava;

class Parent
{
	Parent(int a)
	{
		System.out.println("Parent");
	}
}
public class This_And_Super extends Parent
{This_And_Super(int age)
	{ super(5);
		System.out.println("Age");
	}
This_And_Super(double weight)
{
	this(36);
	System.out.println("Weight");
}
This_And_Super(String name)
{this(42.9);
	System.out.println("Name");
}
This_And_Super()
{   this("Vin");
	System.out.println("Just like that");
	}

	public static void main(String[] args) 
	{
		new This_And_Super();

	}

}
