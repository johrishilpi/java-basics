package java_programs;
class SuperMostClass
{
	void add()
	{
		System.out.println("SuperMost class method add()");
	}
	void add(int a)
	{
		System.out.println("SuperMost class method add(int a)");
	}
}


class ParentClass extends SuperMostClass
{
	void add()
	{
		System.out.println("Super class method add()");
		super.add();
	}
	void add(int a)
	{
		System.out.println("Super class method add(int a)");
		super.add(5);
	}
}
public class SuperKeyword extends ParentClass
{
void add()
{
	System.out.println("Sub class method add()");
	super.add();// super keyword has to be written explicitly
}
void add(int a)
{
	System.out.println("Sub class method add(int a)");
	super.add(2);// super keyword can be any line
}
	public static void main(String[] args) 
	{
		SuperKeyword s1=new SuperKeyword();
		s1.add();
		s1.add(1);
	
	}

}
