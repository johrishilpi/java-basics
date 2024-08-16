package collection;

class Parentclass
{
	void add()
	{
		System.out.println("add in Parent");
	}
	void sub()
	{
		System.out.println("sub in Parent");
	}
}

public class ClassTypecasting_concept extends Parentclass
{
      void mul()
      {
    	  System.out.println("mul in child");
      }
      void div()
     {
    	  System.out.println("div in child");
     }
	public static void main(String[] args) 
	{
		Parentclass r1=new ClassTypecasting_concept();//implicit upcasting
		r1.add();
		r1.sub();
		Parentclass p1=(Parentclass) new ClassTypecasting_concept();//explicit upcasting
		p1.add();
		p1.sub();
		ClassTypecasting_concept b1= (ClassTypecasting_concept) new Parentclass();//downcasting can be done
		//explicitly only. does not have a practical exposure.methods of the childclass and parent class
		//can be used using the concept of inheritance simply
		b1.add();
		b1.div();
		b1.mul();
		b1.sub();

	}

}
