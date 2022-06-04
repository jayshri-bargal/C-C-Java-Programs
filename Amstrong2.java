import java.lang.*;
import java.util.*;

class Number
{
    public void Display()
    {
        System.out.println("Amstrong Number in between 1 to 100 are:");
    }
    public void AmstrongNum()
    {
        int no=0,iDigit=0,i=0,iMult=1,temp=0,iDigCnt=0,Sum=0,temp2=0;
        for(no=1;no<=1000;no++)
        {
            temp=no;
            temp2=no;

            while(temp>0)
            {
                temp=temp/10;
                iDigCnt++;
            }
            temp=no;
            while(temp!=0)
            {
                iDigit=temp%10;
                temp=temp/10;

                for(i=1;i<=iDigCnt;i++)
                {
                    iMult=iMult*iDigit;
                }
                Sum=Sum+iMult;
                iMult=1;
            }
            if(Sum==temp2)
            System.out.println(+Sum);
            Sum=0;
            iDigCnt=0;
        }
    
    }
}
class Amstrong2
{
    public static void main(String arg[])
    {
        Number obj = new Number();
        obj.Display();
        obj.AmstrongNum();
    }
}