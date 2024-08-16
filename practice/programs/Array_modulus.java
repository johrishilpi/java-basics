package practice.programs;

public class Array_modulus {

	public static void main(String[] args) {
	int [] a= {9,2,3,7,4};
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			sum=sum+a[i];
		}
	}
System.out.println(sum);
	}

}
