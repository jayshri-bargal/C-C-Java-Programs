//write a program which accept matrix from user & display addition of elements from each column
import java.lang.*;
import java.util.Scanner;
import java.io.*;
class ArrayX
{
    private int Arr[][];

    public ArrayX(int iRow,int iCol)
    {
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
    public void Summation()
    {
        int i=0,j=0,iSum=0;
        for(i = 0; i < Arr.length; i++)
        {
            for(j=0; j < Arr[i].length;j++)
            {
               iSum=iSum+Arr[j][i];
            }
            System.out.println("Sum of the column "+i+" = " +iSum);
            iSum=0;
        
        }
    
    }
}
class SumColElement
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
         obj.Summation();
        //System.out.println("Maximum number from the Diagonal is "+iRet);
    }
}
