abstract class Marks
{
	abstract double getPercentage();
}
class A extends Marks
{
	double percentage;
	A(double mark1,double mark2,double mark3)
	{
		double a = mark1;
		double b = mark2;
		double c = mark3;
		double sum = a+b+c;
		percentage = (sum/300)*100;
	}
	double getPercentage()
	{
		return percentage;
	}
}
class B extends Marks
{
	double percentage;
	B(double mark1,double mark2,double mark3,double mark4)
	{
		double a = mark1;
		double b = mark2;
		double c = mark3;
		double d = mark4;
		double sum = a+b+c+d;
		percentage = (sum/400)*100;
	}
	double getPercentage()
	{
		return percentage;
	}
}
class Percentage
{
	public static void main(String[] arg)
	{
		A StdOne = new A(68, 75, 89.5);
		B StdTwo = new B(55, 78, 99, 86.5);
		double result1 = StdOne.getPercentage();
		System.out.println("The percentage of student one : " + result1);
		double result2 = StdTwo.getPercentage();
		System.out.println("The percentage of student two : " + result2);
	}
}