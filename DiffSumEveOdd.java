//Accept N numbers from user & return Difference between Summation of
// even & summation of odd elements

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
    public int DisplayDifference()
    {
        int iCnt=0,Sum1=0,Sum2=0;
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            if((Arr[iCnt]%2)==0)
            {
                Sum1=Sum1+Arr[iCnt];
            }
            if((Arr[iCnt]%2)!=0)
            {
                Sum2=Sum2+Arr[iCnt];
            }
        }
        return Sum1-Sum2;
    }
}
class DiffSumEveodd
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
        iRet=obj.DisplayDifference();
        System.out.println("Difference is "+iRet);

        obj = null;
    }
}