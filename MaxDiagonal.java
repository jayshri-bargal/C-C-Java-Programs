//write a program which accept matrix from user & return Maximum number from both the Diagonal
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
    public int Maxdiagonal()
    {
        int i=0,j=0,iMax=Arr[0][0];
        for(i = Arr.length-1; i >= 0; i--)
        {
            for(j=0; j < Arr[i].length;j++)
            {
                if(i==j)
                {
                    if(Arr[i][j] > iMax)
                    {
                    iMax = Arr[i][j];
                    }
                }
               
            }
        
        }
        return iMax;
    }
}
class MaxDiagonal
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
        iRet= obj.Maxdiagonal();
        System.out.println("Maximum number from the Diagonal is "+iRet);
    }
}
