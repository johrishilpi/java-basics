package assignments;
  class Eleven
  {
	  Eleven()
	  {
		  System.out.println("Non Parametric");
	  }
  }
class Ten extends Eleven
  {
	  Ten(double a)
	  {
		System.out.println("Vineet Johri");
	  }  
  }
  class Nine extends Ten
  {
	  Nine(int a,double b)
	  {
	    super(4.78);
		System.out.println("Saurabh Johri"); 
	  }
  }
  class Eight extends Nine
  {  
	  Eight(int a)
	  {
		  super(2,1.23);
		System.out.println("Shilpi Johri"); 
	  }  
  }
public class SuperCallingPara
{
public static void main(String[] args) 
{
	new Eight(100);
}
}
