import java.util.Scanner;
public class Shapes
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		double radius = s.nextInt();
		circle(radius);
		
		System.out.println("Enter the base of the triangle");
		double base = s.nextInt();
		System.out.println("Enter the height of the triangle");
		double height = s.nextInt();
		triangle(base, height);
		
		System.out.println("Enter the length and breadth of the rectangle");
		int length = s.nextInt();
		int breadth = s.nextInt();
		rectangle(length, breadth);
	}
	
	public static void circle(double radius)
	{
		double area = 3.14*(radius*radius);
		System.out.println("Area of the circle: " + area);
	}
	 public static void triangle(double base, double height)
    {   
		double area =  0.5*(base*height);
        System.out.println("Area of triangle: "+area);
    }

    public static void rectangle(int length, int width)
    {   
        double area = length*width;
        System.out.println("Area of rectangle: "+area);
    }
}