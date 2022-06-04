//accept number from user and display its factors
//Input:10
//Output:1 2 5

//Input:  9
//Output: 1 3

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
    public void DisplayFactor()
    {
        int iCnt=0;
        if(iNo<0)
        {
            iNo=-iNo;
        }
        for(iCnt=1;iCnt<=iNo/2;iCnt++)
        {
            if((iNo%iCnt)==0)
            {
                System.out.println(+iCnt);
                
            }
        }
    }
    
}

class Factors
{
    public static void main(String arg[])
    {
        Number obj = new Number();

        obj.Accept();
        obj.Display();
        obj.DisplayFactor();
    
    }
       
}
