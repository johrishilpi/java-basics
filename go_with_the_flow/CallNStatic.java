package go_with_the_flow;

public class CallNStatic {

	void shilpi(int a,int b)
	{
		int sum= a+b;
	System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		CallNStatic C1 = new CallNStatic();
		C1.shilpi(20, 30);
	
	}
}
