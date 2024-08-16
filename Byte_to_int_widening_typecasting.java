package collection;

public class Byte_to_int_widening_typecasting {

	public static void main(String[] args) {
	
		byte a=127;
		int i=a;//implicitly widening byte to int
		System.out.println(i);
		
		int e=(int)a;//explicitly widening byte to int
		System.out.println(e);

	}

}
