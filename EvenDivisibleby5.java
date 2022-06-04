//Accept N numbers from user & display all such elements which are even
//& divisible by 5

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
    public void Displayd()
    {
        int iCnt=0;
        System.out.println("Even Number divisible by 5 are:");
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            if(((Arr[iCnt]%2)==0) &&((Arr[iCnt]%5)==0))
            {
                System.out.println(Arr[iCnt]);
            }
        }
    }
}
class EvenDivisibleby5
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
        obj.Displayd();

        obj = null;
    }
}