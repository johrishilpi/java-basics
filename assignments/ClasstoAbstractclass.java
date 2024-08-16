package assignments;
abstract class Abstracttwo
{
	abstract void add();//abstract method
	abstract void subtract();//abstract method
}
public class ClasstoAbstractclass extends Abstracttwo
{
	@Override
	void add() 
	{
		System.out.println("Actual logic of abstract class 1");
	}
	@Override
	void subtract() 
	{
		System.out.println("Actual logic of abstract class 2");
	}
	public static void main(String[] args)
	{
		ClasstoAbstractclass a1=new ClasstoAbstractclass();
		a1.add();
		a1.subtract();
	}
}
