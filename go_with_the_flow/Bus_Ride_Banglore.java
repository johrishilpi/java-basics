package go_with_the_flow;

public class Bus_Ride_Banglore {
public static void main(String[] args) {
	char gender='M';//Please enter 'M' FOR Male and 'F' for Female
	int age=67;//Please enter your age
	if(gender=='M')
	{
		if(age<=4)
		{
			System.out.println("Kids ride free");
		}
		else if(age>=60)
		{
			System.out.println("Senior citizens ride free");
		}
		else
			System.out.println("Please pay full ticket");
	}
	
	else
	{
	System.out.println("All Women ride for free ..." + "Shilpi");	
	}
}
}
