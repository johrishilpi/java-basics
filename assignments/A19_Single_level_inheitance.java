package assignments;

class FatherSuperClass
{
	static void vineet()
	{
		System.out.println("Vineet Johri");
	}
	
	static void mom()
	{
		System.out.println("Vandana");
	}
	
	void sum()
	{
		int a=25;
		int b=65;
		int c=a+b;
		System.out.println(c);
	}
}

public class A19_Single_level_inheitance extends FatherSuperClass
{
void subtract(int a,int b)
{
	int sub=a-b;
	System.out.println(sub);
}
	public static void main(String[] args)
	{
	System.out.println("Shilpi Johri");
	vineet();
	mom();
	A19_Single_level_inheitance a1=new A19_Single_level_inheitance();
	a1.sum();
	a1.subtract(67, 7);
	
	

	}

}
