//Input: 4
//Output: 1 2 3 4 4 3 2 1
//Complexity :O(2N)

import java.lang.*;
import java.util.*;
class Pattern
{
    private int iRow,iCol;
    public Pattern(int a,int b)
    {
        this.iRow=a;
        this.iCol=b;
    }
    public void DisplayPattern()
    {
        int i=0;
    
         for(i=1;i<=iRow;i++)
        {
            System.out.print("  " +i);
        }
        for(i=iRow;i>=1;i--)
        {
            System.out.print("  " +i);
        }
    }

}
class Pattern5
{
    public static void main(String arg[])
    {
        Pattern obj = new Pattern(5,4);
        obj.DisplayPattern();
    }
}
