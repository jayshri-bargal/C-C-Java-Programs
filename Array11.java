//Accept N numbers from user & check whether that  N number contain
//11 in it or not

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
        int iCnt=0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Values :");

        for(iCnt=0;iCnt < Arr.length;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }
    public void Display()
    {
        int iCnt=0;
        System.out.println("Elements of Array are:");
        for(iCnt=0;iCnt < Arr.length;iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
    public int Check()
    {
        int iCnt=0;
        int iNo2=11;
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            if(iNo2==Arr[iCnt])
            {
                break;
            }
        }
        if(iCnt==Arr.length)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
}
class Array11
{
    public static void main(String arg[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int iLength=0,iRet=0;

        System.out.println("Enter the Size for Array");
        iLength=sobj.nextInt();

        ArrayX obj = new ArrayX(iLength);
        obj.Accept();
        obj.Display();
        iRet=obj.Check();
        if(iRet==1)
        {
            System.out.println("11 is present in Aray");
        }
        else
        {
            System.out.println("11 is not present in Aray");
        }

        obj = null;
    }
}