package assignments;
class Papa
{
	 
	void add()
	{
		System.out.println("This is Papa");
	}
}
class Baby extends Papa
{
	void add()
	{
		System.out.println("This is Baby");
      }
}
public class Method_Overriding 
{
	public static void main(String[] args)
	{
		Baby b1=new Baby();
		b1.add();

	}

}
