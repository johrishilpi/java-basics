package java_programs;
class Superclass
{
	final void add()
	{
System.out.println("I am the Parent add.I am final, so I cannot be overridden");
		
	}
}
public class Method_final extends Superclass
{
void add()
{   
	System.out.println("This is the sub method add");
}
	
	public static void main(String[] args) 
	{
		Method_final m1=new Method_final();
		m1.add();
		

	}

}
