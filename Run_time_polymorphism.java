package practice.programs;
class Supermost
{
	void add()
	{
		System.out.println("Supermost");
	}
}
class Super
{
	void add()
	{
		System.out.println("Super");
	}
}

public class Run_time_polymorphism {
	void add()
	{
		System.out.println("sub class");
	}

	public static void main(String[] args)
	{
		Run_time_polymorphism r1=new Run_time_polymorphism();
		r1.add();
		Super s1=new Super();
		s1.add();
		Supermost s2=new Supermost();
		s2.add();
		

	}

}
