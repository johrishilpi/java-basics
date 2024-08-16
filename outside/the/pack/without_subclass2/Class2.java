package outside.the.pack.without_subclass2;

import outside.the.pack.without_subclass1.Class1;

public class Class2 {

	public static void main(String[] args)
	{
		Class1 c1=new Class1();//like scanner class we are making object of 
		                       //Class 1 calling Class 1 because there is no
		                       //relationship
		c1.add();//in this case the system is giving a warning that this
		//can be accessed in an easier way since it is static by classname.methodname
		//see below
		
		Class1.add();//in this case also we need to import since it is from a separate
		//package
	

	}

}
