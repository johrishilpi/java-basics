package assignments;
interface ParentOne
{
	void add();
	void subtract();
}
interface ParentTwo
{
	void mul();
	void div();
}
public class Multiple_level_inheritance implements ParentOne,ParentTwo
{
public static void main(String[] args) {
	Multiple_level_inheritance a1=new Multiple_level_inheritance();	
a1.add();
a1.subtract();
a1.mul();
a1.div();
	}
	public void mul() {
		
System.out.println("This is the mul method implementation  in interface ParentTwo");	
	}

	public void div() {
System.out.println("This is the div method implementation  in interface ParentTwo");		
	}

	public void add() {
     
System.out.println("This is the add method implementation  in interface ParentOne");		
	}
	public void subtract() {
	
System.out.println("This is the subtract method implementation in interface ParentOne");		
	}

}
