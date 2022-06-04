//check Number is perfect number or not
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
    public Boolean CheckPerfect()
    {
        int iCnt=0,Sum=0;
        for(iCnt=1;iCnt<=iNo/2; iCnt++)
        {
            if((iNo%iCnt)==0)
            {
                
                Sum=Sum+iCnt;
            }
        }
        if(Sum==iNo)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Perfect
{
    public static void main(String arg[])
    {
        Number obj = new Number();
        Boolean bRet=false;

        obj.Accept();
        obj.Display();
        bRet=obj.CheckPerfect();
        if(bRet==true)
        {
        System.out.println("Number is perfect ");
        }
        else
        {
            System.out.println("Number is not perfect");
        }
    }
}
