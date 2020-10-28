import java.util.Scanner;
class AdditionClass
{
	int x,y;
	public void Read()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first no. ");
		x = s.nextInt();
		System.out.println("Enter the second no. ");
		y = s.nextInt();
	}
	public int Sum()
	{
		return(x+y);
	}
	public static void main(String[] arg)
	{
		AdditionClass add = new AdditionClass();
		add.Read();
		int sum = add.Sum();
		System.out.println("The sum is: " + sum);
	}
}