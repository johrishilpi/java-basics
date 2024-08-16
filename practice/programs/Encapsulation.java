package practice.programs;
class sensitive
{
	private int age=23;
public void set(int age)
{
	this.age=age;
}
public int get()
{
	return age;
}
}
public class Encapsulation {

	public static void main(String[] args) 
	{
		sensitive s1=new sensitive();
		s1.set(15);
		System.out.println(s1.get());

	}

}
