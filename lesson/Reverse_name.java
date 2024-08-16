package lesson;

public class Reverse_name {

	public static void main(String[] args) {
	String name="Shilpi";
	String name1="";
	for (int i=name.length()-1;i>=0;i--)
	{
		char a=name.charAt(i);
		name1=name1+a;
	}
System.out.println(name1);
	}

}
