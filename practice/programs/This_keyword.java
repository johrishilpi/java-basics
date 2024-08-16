package practice.programs;

public class This_keyword {
	private int gv=18;
   void set (int a)
   {
	 this.gv=a;  
   }
   int get()
   {
	   return gv;
   }
	
	
	public static void main(String[] args) {
		This_keyword t1=new This_keyword();
		t1.set(15);
		System.out.println(t1.get());
		
	}

}
