abstract class Parent
{
	abstract void message();
}
class SubclassOne extends Parent
{
	void message()
	{
		System.out.println("This is the first subclass");
	}
}
class SubclassTwo extends Parent
{
	void message()
	{
		System.out.println("This is the second subclass");
	}
}
class Abstract
{
	public static void main(String[] args)
	{
		SubclassOne first = new SubclassOne();
		SubclassTwo second = new SubclassTwo();
		first.message();
		second.message();
	}
}