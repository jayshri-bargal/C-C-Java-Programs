//Input: 4
//Output:-4 -3 -2 -1  0  1 2 3 4
//complexity: O(2N)

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
        for(i=-iRow;i<=iRow;i++)
        {
            System.out.print("  " +i);
        }
         
    
    }

}
class Pattern7
{
    public static void main(String arg[])
    {
        Pattern obj = new Pattern(4,4);
        obj.DisplayPattern();
    }
}
