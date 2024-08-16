package practice.programs;

public class String_Buffer_ensurecapacity {

	public static void main(String[] args) {
	StringBuffer s1=new StringBuffer();
	System.out.println("Before Capacity is: "+s1.capacity());
	s1.ensureCapacity(20);
	System.out.println("After Capacity is: "+s1.capacity());
	StringBuffer s2=new StringBuffer("Shilpi Johri");
	System.out.println("Before Capacity is: "+s2.capacity());
	s2.ensureCapacity(35);
	System.out.println("After Capacity is: "+s2.capacity());

	}

}
