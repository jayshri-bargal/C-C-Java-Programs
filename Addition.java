//Accept N number from user And Return its Addition
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
        System.out.println("Enter the elements of Array:");
        
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }
    public void Display()
    {
        int iCnt=0;
        System.out.println("Elements of Array Are:");
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
    public int DisplayAddition()
    {
        int iCnt=0,Sum=0;
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            Sum=Sum+Arr[iCnt];
        }
        return Sum;
    }
}
class Addition
{
    public static void main(String arg[])
    {
        int iLength=0,iRet=0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        iLength = sobj.nextInt();

        ArrayX obj = new ArrayX(iLength);
        obj.Accept();
        obj.Display();
        iRet = obj.DisplayAddition();
        System.out.println("Addition of Elments Are:"+iRet);

        obj = null;
    }
}