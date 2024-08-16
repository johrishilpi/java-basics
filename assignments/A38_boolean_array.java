package assignments;

import java.util.Arrays;

public class A38_boolean_array {

	public static void main(String[] args) {
		boolean [] b=new boolean[6];
		b[0]=true;
		b[1]=false;
		b[2]=true;
		b[3]=false;
		b[4]=true;
		b[5]=false;
		System.out.println(Arrays.toString(b));
		for(int i=0;i<6;i++)
		{
		System.out.println(b[i]);
	    }
	}
}

