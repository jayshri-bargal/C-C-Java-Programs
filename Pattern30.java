//to print rombous star
/*
Input : rows:5  column: 5
output: 
 *  *  *  *
  *  *  *  *
   *  *   *  *
    *  *   *  * 
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
        
    if(iRow!=iCol)
    {
      return;
    }
    for(i=1;i<=iRow;i++)
    {
      for(j=1;j<i;j++)
      {  
      System.out.print("   ");
      }
      for(j=1;j<=iCol;j++)
      {
        System.out.print("*  ");
      }

      System.out.println();
    }
    for(i=1;i<=iRow;i++)
    {
      for(j=1;j<=iRow-i;j++)
      {  
      System.out.print("   ");
      }
      for(j=1;j<=iCol;j++)
      {
        System.out.print("*  ");
      }

      System.out.println();
    }
          
  }
}
class Pattern30
{
    public static void main(String arg[])
    {
        Pattern obj = new Pattern(4,4);
        obj.DisplayPattern();
    }
}
