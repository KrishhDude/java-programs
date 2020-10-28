/*Program that consists of 4 application classes for the operation addition, substraction, division and multiplication.
Each class must consist of:
	Two attributes
	One parametrized constructor to initialize class attributes
	One member function to perform corresponding arithmetic operation and to display the
	result.
	Create objects for each class and perform the functions.
*/
-----------------------------------------------------------------------

import java.util.Scanner;
public class Operations
{
	public static void main(String[] arg)
	{
		int x,y;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers");
		x = s.nextInt();
		y = s.nextInt();
		System.out.println("The sum is:");
		sum obj = new sum();
		add(x,y);
	}
}
class sum
{
	int a,b;
	public void add(int a,int b)
	{
		int result = a+b;
		System.out.println(result);
	}
}	