//Accept N Numbers  from user and Display Even numbers

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
        Scanner sobj= new Scanner(System.in);
        System.out.println("Enter the Elements of Array:");

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
    public void DisplayEven()
    {
        int iCnt=0;
        System.out.println("Even elements of Array are");
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            if((Arr[iCnt]%2)==0)
            {
                System.out.println(Arr[iCnt]);
            }
        }
    }
}
class EvenArray
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iLength=0;
        System.out.println("Enter the Values for Constructor");
        iLength = sobj.nextInt();

        ArrayX obj = new ArrayX(iLength);
        obj.Accept();
        obj.Display();
        obj.DisplayEven();

        obj=null;


    }
}
        

        
    
    
