package assignments;

public class ThisKeyword {
String name;
int age;
double salary;

void add(String name,int age,int salary)
{
	System.out.println("This is a non static method");
	this.name=name;
	this.age=age;
	this.salary=salary;
			
}
	public static void main(String[] args) {


		ThisKeyword t1=new ThisKeyword();
		t1.add("Ram", 25, 70000);
		System.out.println(t1.name);
		System.out.println(t1.age);
		System.out.println(t1.salary);
		
		
		
	
		

	}

}
