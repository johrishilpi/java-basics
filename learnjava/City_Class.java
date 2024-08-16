package learnjava;

class Country_Class
{
	Country_Class()
	{
		System.out.println("Country Class Constructor");
	}
}
class State_Class extends Country_Class
{
	State_Class(boolean a)
	{
		System.out.println("State Class Constructor");
	}
}

public class City_Class extends State_Class
{
	City_Class(int a)
	{super(true);
		System.out.println("City Class Constructor");
	}

	public static void main(String[] args)
	{
	new City_Class(100);

	}

}
