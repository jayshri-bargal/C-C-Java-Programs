//check Number is pallindrome or not
import java.lang.*;
import java.util.*;

class Number
{
    private int iNo;

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number");
        this.iNo = sobj.nextInt();
    }
    public void Display()
    {
        System.out.println("The value is :"+this.iNo);
    }
    public Boolean CheckPallindrome()
    {
        int iDigit=0,Rev=0,temp=0;
        temp=iNo;
        while(iNo!=0)
        {
            iDigit=iNo%10;
            Rev = Rev*10+iDigit;
            iNo = iNo/10;
        }
        if(Rev==temp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
class Pallindrome
{
    public static void main(String arg[])
    {
        Number obj = new Number();
        Boolean bRet=false;

        obj.Accept();
        obj.Display();
        bRet=obj.CheckPallindrome();
        if(bRet==true)
        {
            System.out.println("Number is Pallindrom");
        }
        else
        {
            System.out.println("Number is not pallindromic");
        }
    }
}
