package assignments;
abstract class AbsSuper
{
	abstract void add();
	abstract void subract();
}
class Parent extends AbsSuper
{
	void vin()
	{
		System.out.println("Vineet");
	}
	static void van()
	{
		System.out.println("Vandana");
	}
	@Override
	void add() 
	{	 
		System.out.println("Confidential 1");
	}
	@Override
	void subract() {
		System.out.println("Confidential 2");
	}
}
public class Abstract1 extends Parent
{
	void mug()
	{
		System.out.println("Diva");
	}
	static void shils()
	{
		System.out.println("Shilpi");
	}
	public static void main(String[] args) 
	{
	shils();
	van();
	Abstract1 a1=new Abstract1();
	a1.add();
	a1.mug();
	a1.subract();
	a1.vin();
	
	}
}