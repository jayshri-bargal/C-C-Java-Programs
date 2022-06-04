//using switch case
//1   4000
//2  8000
//5   20000
//10   40000

import java.lang.*;
import java.util.*;
class Number
{
    private int iWeight;

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the gold coin Size that you want");
        this.iWeight = sobj.nextInt();
    }
    public void Display()
    {
        System.out.println("the gold coin size are"+this.iWeight);
    }
    public void  JwellarPortal()
    {
        
        switch(iWeight)
        {
            case 1:
            System.out.println("your bill Amount is 4000");
            break;

            case 2:
            System.out.println("your bill Amount is 8000");
            break;

            case 5:
            System.out.println("your bill Amount is 20000");
            break;

            case 10:
            System.out.println("your bill Amount is 40000");
            break;

            default:
            System.out.println("Invalid Weight");


        }
    }
}
class Demo
{
    public static void main(String arg[])
    {
        Number obj=new Number();
        obj.Accept();
        obj.Display();
        obj.JwellarPortal();
    }
}