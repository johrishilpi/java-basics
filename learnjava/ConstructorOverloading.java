package learnjava;

public class ConstructorOverloading {

	ConstructorOverloading(short a)
	{

		System.out.println("Saurabh");
	}
	ConstructorOverloading(int a)
	{
		System.out.println("Shilpi");
	}
	ConstructorOverloading(byte a)
	{

		System.out.println("Vineet");
	}
	ConstructorOverloading(long b) 
	{

		System.out.println("Vandana");
	}
	

	public static void main(String[] args) {
		
		new ConstructorOverloading((byte)99);
		new ConstructorOverloading((long)99);
		new ConstructorOverloading((short)99);
		new ConstructorOverloading(99);

	}

}
