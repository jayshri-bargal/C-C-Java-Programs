//Input: Row 4  columns: 4
/* 
  *    *   *   *
  *    &   &   *
  *    &   &   *
  *    *   *   *
  */ 
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
               if((i==1) || (j==1) || (i==iRow) || (j==iCol))
               {
                   System.out.print("  *");
               }
               else
               {
                System.out.print("  &");
               }
            }
            System.out.println();
        }
          
    }
}
class Pattern14
{
    public static void main(String arg[])
    {
        Pattern obj = new Pattern(4,4);
        obj.DisplayPattern();
    }
}
