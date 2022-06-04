//accept number from user and display its factors
//Input:10
//Output:1 2 5    // 8

//Input:  9
//Output: 1 3    //4

//Input:  17
//Output:  1

//Input : 20
//Output: 1 2 4 5 10

//Input: -20
//Output:  1 2 4 5 10

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
    
}

class SumFactors
{
    public static void main(String arg[])
    {
        Number obj = new Number();
        int iRet=0;
        obj.Accept();
        obj.Display();
        iRet=obj.DisplaySumFactor();
        System.out.println("Sum of factors are:"+iRet);
    
    }
       
}
