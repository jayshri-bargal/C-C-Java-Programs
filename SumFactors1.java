//accept number from user and display its factors
//Input:10
//Output:1 2 5    // 8

//Input:  9
//Output: 1 3    //4

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
    public int DisplaySumFactor()
    {
        int iCnt=0,Sum=0;
        if(iNo<0)
        {
            iNo=-iNo;
        }
        for(iCnt=1;iCnt<=iNo/2;iCnt++)
        {
            if((iNo%iCnt)==0)
            {
                Sum=Sum+iCnt;
            }
        }
        return Sum;
    
    }
    public int CheckPerfect()
    {
        int Ans=DisplaySumFactor();
        if(Ans==iNo)
        {
            return 1;
        }
        else
        {
            return 0;
        }

    }
    
}

class SumFactors1
{
    public static void main(String arg[])
    {
        Number obj = new Number();
        int iRet=0;
        obj.Accept();
        obj.Display();
        iRet=obj.CheckPerfect();
        if(iRet==1)
        {
            System.out.println("Number is Perfect");
        }
        else
        {
            System.out.println("Number is not Perfect");
        }
    
    
    }
       
}
