//Accept N numbers from user and Display all such numbers 
//which contains 3 digits in it

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
    public void Digits()
    {
        int iCnt=0,no=0,res=0;
        System.out.println("Elements which Contain 3 Digits");
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            int temp=Arr[iCnt];
            int count=0;
            while(temp!=0)
            {
                res= temp % 10;
                temp = temp / 10;
                count++;
            }
            if(count==3)
            {
                System.out.println(Arr[iCnt]);
            }
            
        }
    }
}
class ArrayContain3Digit
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
        obj.Digits();

        obj = null;
    }
}