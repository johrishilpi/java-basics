package assignments;

import java.util.Arrays;

public class Incomplete_array {
	static int [] b=new int[6];
	int [] c=new int[5];

	public static void main(String[] args) {
		int [] a=new int[4];
		a[0]=23;
		a[1]=46;
		b[0]=67;
		b[1]=90;
		b[2]=98;
		Incomplete_array i1=new Incomplete_array();
		i1.c[0]=12;
		i1.c[1]=32;
		i1.c[4]=77;		
		String [] s=new String[6];
		s[0]="Ram";
		s[1]="Shyam";
		s[5]="Gita";
		double [] d=new double[4];
		d[0]=7.8;
		d[1]=8.9;
		d[3]=9;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(i1.c));
		System.out.println(Arrays.toString(s));
		System.out.println(Arrays.toString(d));

	}

}
