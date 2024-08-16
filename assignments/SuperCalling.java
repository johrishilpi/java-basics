package assignments;

class Grand
{
	Grand()
	{    super();
		System.out.println("Raghunath Sharan Johri");
	}
}

class One extends Grand
{ One()
	{ super();
	System.out.println("Vineet Johri");
	}

}
class Two extends One
{
  Two()
  {   
	  System.out.println("Shilpi Johri");
	}
   
}


public class SuperCalling
{
	public static void main(String[] args) 
	{
		new Two();
	}

}
