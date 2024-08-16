package area.perimeter.scanner;

import java.util.Scanner;

public class Father_area_peri 

{ 
	static Scanner s1=new Scanner(System.in);
	static void circle()
	{
		System.out.println("Enter the radius of the circle");
		double radius=s1.nextDouble();
		double areacircle=Math.PI*radius*radius;
		double circumfercircle=2*Math.PI*radius;
		System.out.println("The area of the circle is "+areacircle);
		System.out.println("The circumference of the circle is " +circumfercircle);
	}
	
	static void triangle()
	{
		System.out.println("Enter the length of the base of the triangle");
		double base=s1.nextDouble();
		System.out.println("Enter the length of the 2nd side of the triangle");
		double secside=s1.nextDouble();
		System.out.println("Enter the length of the 3rd side of the triangle");
		double thirdside=s1.nextDouble();
		System.out.println("Enter the height of the triangle");
		double height=s1.nextDouble();
		double areatri=0.5*base*height;
		double peritri=base+secside+thirdside;
		System.out.println("The area of the Triangle is "+areatri);
		System.out.println("The perimeter of the triangle is "+peritri);
		
	
	}
	static void square()
	{
		System.out.println("Enter length of the side of a square");
		double side=s1.nextDouble();
		double areasq=side*side;
		double perisq=4*side;
		System.out.println("The area of the square is "+areasq);
		System.out.println("The perimeter of the square is "+perisq);
	
	}
	static void rectangle()
	{
		System.out.println("Enter the length of the rectangle");
		double lengthrec=s1.nextDouble();
		System.out.println("Enter the width of the rectangle");
		double w=s1.nextDouble();
		double arearec=lengthrec*w;
		double perirec=lengthrec+lengthrec+w+w;
		System.out.println("The area of the rectangle is "+arearec);
		System.out.println("The perimeter of the rectangle is "+perirec);
	}
	
	static void trapezium()
	{
		System.out.println("Enter the length of the 1st base of the trapezium");
		double base1=s1.nextDouble();
		System.out.println("Enter the length of the 2nd base of the trapezium");
		double base2=s1.nextDouble();
		System.out.println("Enter the length of the 1st non parallel side of the trapezium");
		double np1=s1.nextDouble();
		System.out.println("Enter the length of the 2nd non parallel side of the trapezium");
		double np2=s1.nextDouble();
		System.out.println("Enter the height of the trapezium");
		double ht=s1.nextDouble();
		double area=0.5*(base1+base2)*ht;
		double peritrap=base1+base2+np1+np2;
		System.out.println("The area of the Trapezium is "+area);
		System.out.println("The perimeter of the Trapezium is "+peritrap);
	}
	

}
