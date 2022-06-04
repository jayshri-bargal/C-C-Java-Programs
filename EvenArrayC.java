//Accept N numbers from user and display Even count

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
        System.out.println("Enter the elements of Array");
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }
    public void Display()
    {
        int iCnt=0;
        System.out.println("Elements of Array are:");
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
    public int EvenCount()
    {
        int iCnt=0,eCount=0;
        System.out.println("Number of Even Elements in Array are:");
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            if((Arr[iCnt]%2)==0)
            {
            eCount++;
            }
        }
        return eCount;
    }

}
class EvenArrayC
{
    public static void main(String arg[])
    {
        int iLength=0,iRet=0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter size of Array");
        iLength = sobj.nextInt();

        ArrayX obj = new ArrayX(iLength);
        obj.Accept();
        obj.Display();
        iRet=obj.EvenCount();
        System.out.println(iRet);

    }
}