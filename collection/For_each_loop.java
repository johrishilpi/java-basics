package collection;
import java.util.ArrayList;
public class For_each_loop {
public static void main(String[] args)
	{ ArrayList <Double> a1= new ArrayList();
	a1.add(78.6);
	a1.add(84.3);
	a1.add(90.83);
	a1.add(89.9);
	a1.add(92.9);
	Double j=0.0;
	for(Double i:a1)
	{
		j=j+i;
		System.out.println(i);
	}
	System.out.println(j);

	}

}
