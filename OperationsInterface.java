//Write a Java program that creates four floaterfaces Add, Sub, Mul and Div. 
//Each floaterface should consist of one parameterized abstract method for the corresponding arithmetic operation.  
//Create a class ‘ArithmeticClass’ by implementing all floaterfaces.
//Make an object of type ‘ArithmeticClass’  and invoke every method to perform arithmetic operations.

import java.util.Scanner;

interface Add
{
    void add(float a, float b);
}
interface Sub
{
    void sub(float a, float b);
}
interface Mul
{
    void mul(float a, float b);
}
interface Div
{
    void div(float a, float b);
}
class ArithmeticClass implements Add, Sub, Mul, Div
{
    public void add(float a, float b){
        System.out.println("Sum is : "+ (a+b));
    }
    public void sub(float a, float b){
        System.out.println("Difference is : "+ (a-b));
    }
    public void mul(float a, float b){
        System.out.println("Product is : "+ (a*b));
    }
    public void div(float a, float b){
        System.out.println("Division is : "+ (a/b));
    }
    
}
class OperationsInterface
{
    public static void main(String[] arg)
    {
        Scanner s = new Scanner(System.in);
        float x,y;
        System.out.println("Enter 2 integers");
        x = s.nextFloat();
        y = s.nextFloat();
        ArithmeticClass calc = new ArithmeticClass();
        calc.add(x, y);
        calc.sub(x, y);
        calc.mul(x, y);
        calc.div(x, y);
        s.close();
    }
}
