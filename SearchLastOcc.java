//Accept N number from user And return the last occurance index of search element

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
    public int SearchLastOccurance(int iNo2)
    {
        int iCnt=0;
        for(iCnt=Arr.length-1;iCnt>=0;iCnt--)
        {
            if(iNo2==Arr[iCnt])
            {
                break;
            }
        }
        if(iCnt==Arr.length)
        {
            return 1;
        }
        else
        {
        return iCnt;
        }
    }
}
class SearchLastOcc
{
    public static void main(String arg[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int iLength=0,iRet=0,iValue=0;

        System.out.println("Enter the Size for Array");
        iLength=sobj.nextInt();

        ArrayX obj = new ArrayX(iLength);
        obj.Accept();
        obj.Display();
        System.out.println("Enter the element to search");
        iValue = sobj.nextInt();
        iRet=obj.SearchLastOccurance(iValue);
        if(iRet==1)
        {
            System.out.println("element is not there");
        }
        else
        {
            System.out.println("element Last Occured at index "+iRet);
        }

        obj = null;
    }
}