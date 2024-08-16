package learnjava;

public class String_split2 {

	public static void main(String[] args) {
		String name="My name is Shilpi";
		int a=name.lastIndexOf(' ');
		System.out.println(a);
		String name1=name.substring(0, a);
		System.out.println(name1);
		String name2=name.substring(a);
		System.out.println(name2);
		System.out.println(name1.concat(",").concat(name2));
		
		

	}

}
