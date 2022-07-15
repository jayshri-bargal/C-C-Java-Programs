//write a program which accept matrix from user & Swap the contents of Consecutive rows.
import java.lang.*;
import java.util.Scanner;
import java.io.*;
class ArrayX
{
    public int Arr[][]; 
    public int iRow;
    public int iCol;

    public ArrayX(int a,int b)
    {
        this.iRow = a;
        this.iCol = b;
        Arr=new int[iRow][iCol];
    }

    public void Accept()
    {
        int i=0,j=0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the elements of Array:");
        for(i=0; i<Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
            Arr[i][j] = sobj.nextInt();
            }
        }
    }
    public void Display()
    {
        int i=0,j=0,iSum=0;
        for(i = 0; i < iRow; i++)
        {
            for(j=0; j < iCol;j++)
            {
              System.out.print(Arr[i][j]+"  ");
            }
            System.out.println();
        
        }
    
    }
    public void AfterSwap()
    {
        for(int i = 0; i < iRow-1;i++,i++)
        {
            for(int j = 0;j<iCol;j++)
            {
                int Temp = Arr[i][j];
                Arr[i][j] = Arr[i+1][j];
                Arr[i+1][j] = Temp;
            }
        }
       

    }
}
class SwapRow
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of Row");
        int iValue1 = sobj.nextInt();
        System.out.println("Enetr the Number of column ");
        int iValue2 = sobj.nextInt();
       

        int iRet=0;
        ArrayX obj = new ArrayX(iValue1,iValue2);
        obj.Accept();
        obj.Display();
        System.out.println("Data after swapping");
        obj.AfterSwap();
        obj.Display();
        
    }
}
