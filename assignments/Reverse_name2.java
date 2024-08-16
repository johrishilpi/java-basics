package assignments;

public class Reverse_name2 {

	public static void main(String[] args) {
		String name="Shilpi Johri";
		System.out.println(name);
		String rev="";
		for(int i=name.length()-1;i>=0;i--)
		{char b=name.charAt(i);
			rev=rev+b;
		}
		System.out.println(rev);

	}

}
