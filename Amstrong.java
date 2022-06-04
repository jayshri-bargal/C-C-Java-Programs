import java.lang.*;
import java.util.*;

class Number
{
    private int iNo;

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Number");
        this.iNo = sobj.nextInt();
    }
    public void Display()
    {
        System.out.println("the value is:"+this.iNo);
    }
    public Boolean Amstrong()
    {
        int Temp=0,iDigit=0,iDigCnt=0,iCnt=0,iMult=1,Sum=0;
        Temp=iNo;
        while(iNo!=0)
        {
            iNo=iNo/10;
            iDigCnt++;
        }
        iNo=Temp;
        while(iNo!=0)
        {
            iMult=1;
            iDigit=iNo%10;
            for(iCnt=1;iCnt<=iDigCnt;iCnt++)
            {
                iMult=iMult*iDigit;
            }
            Sum=Sum+iMult;
            iNo=iNo/10;
        }
        if(Sum==Temp)
        {
            return true;
        }
        else
        {
        return false;
        }

    }
}
class Amstrong
{
    public static void main(String arg[])
    {
        Boolean bRet=false;
        Number obj = new Number();
        obj.Accept();
        obj.Display();
        bRet=obj.Amstrong();
        if(bRet==true)
        {
            System.out.println("Number is Amstrobg");
        }
        else
        {
            System.out.println("Number is not Amstrong");
        }
    }
}