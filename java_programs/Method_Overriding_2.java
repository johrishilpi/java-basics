package java_programs;
class Parent
{
	static void add()
	{
		System.out.println("addparent");
	}
	static void sub()
	{
		System.out.println("subParent");
	}
	
}
public class Method_Overriding_2 extends Parent
{

	static void add()
	{ 
		System.out.println("addchild");
	}
	static void sub()
	{
		
		System.out.println("subchild");
	}
	public static void main(String[] args) {
	
add();
sub();
	}

}
