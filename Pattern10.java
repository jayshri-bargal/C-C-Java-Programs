
 //Input: Row 4  columns: 4
/*1 2 3 4
  1 2 3 4
  1 2 3 4
  1 2 3 4*/ 
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
        int i=0,j=0;
        for(i=1;i<=iRow;i++)
        {
            for(j=1;j<=iCol;j++)
            {
                System.out.print("  "+j);
            }
            System.out.println();
        }
          
    }
}
class Pattern10
{
    public static void main(String arg[])
    {
        Pattern obj = new Pattern(4,4);
        obj.DisplayPattern();
    }
}
