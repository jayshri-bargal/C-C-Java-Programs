//convert this code into pure oop

import java.lang.*;
import java.util.*;
class program86
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number of Rows");
        int iRow = sobj.nextInt();

        System.out.println("Enter Number of Columns");
        int iCol = sobj.nextInt();

        int Arr[][] = new int[iRow][iCol];

        System.out.println("Enter the Data");

        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr[i].length; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
        System.out.println("Elements of Array are: ");

        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr[i].length; j++)
            {
                System.out.print(Arr[i][j]+" ");
            }
            System.out.println();
        }
        Arr = null;
        System.gc();
    
    }
}
