////Accept number from user & reverce that Number return that number
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
    public int DisplayReverce()
    {
        int iCnt=0, iDigit=0,Rev=0;
        while(iNo!=0)
        {
            iDigit=iNo%10;
            Rev = Rev *10 + iDigit;
            iNo=iNo/10;
        }
        return Rev;

    }
}
class Reverce
{
    public static void main(String arg[])
    {
        Number obj = new Number();
        int iRet=0;
        obj.Accept();
        obj.Display();
        iRet=obj.DisplayReverce();
        System.out.println("Reverce Number is"+iRet);
    }
}


