package java_programs;
class Sensitive
{
	private int age=18;
	public void setAge(int age) // setter
	{
		this.age= age;
	}
	public int getAge()//getter
	{
		return age;
	}
}
public class Encapsulation_get_set {

	public static void main(String[] args) {
	
		Sensitive s1=new Sensitive();
		s1.setAge(32);
	  System.out.println(s1.getAge());
	}

}
