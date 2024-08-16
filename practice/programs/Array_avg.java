package practice.programs;

public class Array_avg {

	public static void main(String[] args) {
	int [] a= {2,4,9,3,8};
	double sum=0.0;
	int len=a.length;
	for(int i=0;i<len;i++)
	{
     sum=sum+a[i];
	}
System.out.println(sum);
double avg=sum/len;
System.out.println("The average of the numbers is : "+avg);
}
}
