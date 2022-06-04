/*Accept N numbers from user and Display the Addition od Digits
Input: 1234   346   761  8912
Output:10     13     14   20  */

import java.lang.*;
import java.util.*;
class ArrayX
{
    private int Arr[];
    public ArrayX(int iNo)
    {
        Arr = new int[iNo];
    }
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the elements of Array");
        int iCnt=0;
        for(iCnt=0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }
    public void Display()
    {
        int iCnt=0;
        System.out.println("elements Are:");
        for(iCnt=0;iCnt< Arr.length;iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
    public void DisplaySummation()
    {
        int iCnt=0;
        System.out.println("Addition oF Digits Are:");
        for(iCnt=0;iCnt < Arr.length; iCnt++)
        {
            int Temp=0,iDigits=0,Sum=0;
            Temp = Arr[iCnt];
            while(Temp!=0)
            {
                iDigits = Temp%10;
                Sum=Sum+iDigits;
                Temp = Temp/10;  
            } 
            System.out.println(Sum);
        }
    
    }
}
class SumOfDigitsA
{
    public static void main(String arg[])
    {
        int iLength=0,iRet=0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        iLength = sobj.nextInt();

        ArrayX obj = new ArrayX(iLength);
        obj.Accept();
        obj.Display();
        obj.DisplaySummation();
        //System.out.println("Addition of Digits Are"+iRet);

        obj = null;
    }
}