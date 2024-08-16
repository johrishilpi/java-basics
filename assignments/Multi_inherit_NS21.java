package assignments;
class Raghunath
{
	void sushila()
	{
		System.out.println("Raghunath Sharan Johri");
	}
}
class vineet extends Raghunath
{
    void vandana()
    {
    	System.out.println("Vineet Johri");
    }
}
public class Multi_inherit_NS21 extends vineet
{
	void shilpi()
	{
		System.out.println("Shilpi Johri");
	}
public static void main(String[] args) 
{
	Multi_inherit_NS21 m1=new Multi_inherit_NS21();
	m1.sushila();
	m1.vandana();
	m1.shilpi();

	
}
}
