//Input: Row 6 columns: 6
/*
* 
*  *                      with reduce complexity
*  *  *
*  *  *  *
  */ 


import java.lang.*;
import java.util.*;

import javax.lang.model.util.ElementScanner14;
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
            for(j=1;j<=i;j++)
            {
               
               
                System.out.print("\t*");
               
            }
            System.out.println();
        }
          
    }
}
class Pattern19
{
    public static void main(String arg[])
    {
        Pattern obj = new Pattern(6,6);
        obj.DisplayPattern();
    }
}
