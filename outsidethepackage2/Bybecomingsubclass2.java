package outsidethepackage2;

import outsidethepackage1.Bybecomingsubclass1;

public class Bybecomingsubclass2 extends Bybecomingsubclass1
{
public static void main(String[] args) 
{ 
	Bybecomingsubclass2 b1= new Bybecomingsubclass2();//object of child class
	b1.add();;
	b1.sub();//in this case the system is giving a warning that this
	//can be accessed in an easier way since it is static by classname.methodname
	//see below
	
	
	Bybecomingsubclass1.add();//in this case also we need to import since
	//it is from a separate package
	Bybecomingsubclass1.sub();//in this case also we need to import since
	//it is from a separate package
}
}
