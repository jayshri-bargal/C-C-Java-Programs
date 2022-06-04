//accept number from user and display  Sum of Odd digits
import java.lang.*;
import java.util.*;
class Number
{
    private int iNo;

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number");
        this.iNo = sobj.nextInt();

    }
    public void Display()
    {
        System.out.println("the value is:"+this.iNo);
    }
    public int DisplaySumOddDigits()
    {
        int Sum=0,iDigit=0;
        while(iNo!=0)
        {
            iDigit=iNo%10;
            if((iDigit%2)!=0)
            {
                Sum=Sum+iDigit;
            }
        
            iNo=iNo/10;
        }
        return Sum;
    }
}  
class SumOddDigit
{
    public static void main(String arg[])
    {
        Number obj = new Number();
        int iRet=0;
        obj.Accept();
        obj.Display();
        iRet=obj.DisplaySumOddDigits();
        System.out.println("Summation of  Odd Digits are:"+iRet);
    }
}


