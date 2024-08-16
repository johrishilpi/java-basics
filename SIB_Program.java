package collection;

public class SIB_Program {
	static //SIB
	{
		System.out.println("I am the SIB");
	}
	{//IIB
		System.out.println("I am the IIB");
	}
	SIB_Program()  //Constructor
	{
		System.out.println("I am the Constructor");
	}

	public static void main(String[] args) {
		new SIB_Program();
	    System.out.println("I am the main method");
	    new SIB_Program();
	}

}
