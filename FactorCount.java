//accept number from user and count the number of factor
//Input:10
//Output:1 2 5

//Input:  9
//Output: 1 3


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
    public int DisplayFactor()
    {
        int iCnt=0,Count=0;
        if(iNo<0)
        {
            iNo=-iNo;
        }
        for(iCnt=1;iCnt<=iNo/2;iCnt++)
        {
            if((iNo%iCnt)==0)
            {
                Count++;
                
            }
        }
        return Count;
    }
    
}

class FactorCount
{
    public static void main(String arg[])
    {
        Number obj = new Number();
        int iRet=0;
        obj.Accept();
        obj.Display();
        iRet=obj.DisplayFactor();
        System.out.println("Number of Factors are:"+iRet);
    
    }
       
}
