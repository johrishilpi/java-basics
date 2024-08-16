package go_with_the_flow;

public class Amazon {

	Amazon()
	{
		System.out.println("Login to Amazon");
	}
	Amazon(int a)
	{
		System.out.println("logout from Amazon");
	}
	Amazon(String name)
	{
		System.out.println("from Amazon");
	}
	public static void main(String[] args) {
		 
		new Amazon();
		new Amazon(100);
		new Amazon("Shilpi");
	//Amazon a1=new Amazon();// just creating the object will invoke the
		                      //constructor automatically
		
		
		//or
		//new Amazon();// another way of creating an object without the ref variable
		//new Amazon();
		//new Amazon();// new Classname();
	
	
	}
}
