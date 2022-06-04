//Accept Number from user And Check Whether it is Prime or not with Flag

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
        System.out.println("The value is "+this.iNo);
    }
    public int CheckPrime()
    {
        int iCnt=0;
        int Flag=0;
        if(iNo<0)
        {
            iNo=-iNo;
        }
        for(iCnt=1;iCnt<=iNo/2;iCnt++)
        {
            if((iNo%2)!=0)
            {
                Flag=1;
                continue;
            }
            else
            {
                return Flag;
            }
        }
            
        return Flag;
        
    }
    
}

class PrimeFlag
{
    public static void main(String arg[])
    {
        Number obj = new Number();
        int bRet=0;

        obj.Accept();
        obj.Display();
        bRet=obj.CheckPrime();
        if(bRet==1)
        {
            System.out.println("Number is Prime ");
        }
        else
        {
            System.out.println("Number is not Prime");
        }
        
    }
}
