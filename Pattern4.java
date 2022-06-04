//Input: 5
//Output: 5  *  4  *  3  *  2  *   1  *

import java.lang.*;
import java.util.*;

class Pattern
{
    private int iRow, iCol;

    public Pattern(int a, int b)
    {
        iRow = a;
        iCol = b;
    }

    public void DisplayPattern()
    {
        int i=0;
        
        for(i=iRow;i>=1;i--)
        {
            System.out.print(i+ "\t*\t");
        }
    }
}

class Pattern4
{
    public static void main(String arg[])
    {
            Pattern obj = new Pattern(5,4);

            obj.DisplayPattern();
    }
}