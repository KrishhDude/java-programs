  class Addition
  {
    int x,y;
    Addition(int a, int b)
    {
      x = a;
      y = b;
    }
    public void sum()
    {
      int sum = x+y;
      System.out.println("Sum = " + sum);
    }
  }
  class Substraction
  {
    int x,y;
    Substraction(int a, int b)
    {
      x = a;
      y = b;
    }
    public void diff()
    {
      int diff = x-y;
      System.out.println("difference = " + diff);
    }
  }
    
  class Multiplication
  {
    int x,y;
    Multiplication(int a, int b)
    {
      x = a;
      y = b; 	
    }
    public void product()
    {
      int product = x*y;
      System.out.println("Product = " + product);
    }
  }
  class Division
  {
    int x,y;
    Division(int a, int b)
    {
      x = a;
      y = b;
    }
    public void div()
    {
      int div = x/y;
      System.out.println("Division = " + div);
    }
  }
public class Arithmetic
{
  
  public static void main(String[] arg)
  {
    Addition a = new Addition(1,3);
    Substraction s = new Substraction(5,2);
    Multiplication p = new Multiplication(5,2);
    Division d = new Division(10,2);
    a.sum();
    s.diff();
    p.product();
    d.div();
  }
} 