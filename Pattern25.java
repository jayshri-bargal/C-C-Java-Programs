//Input: Row 4 columns: 4
/*
  *  *  *  *
  *  *  *
  *  *
  *
  
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
        char ch='\0';
        if(iRow!=iCol)
        {
            return;
        }
        for(i=iRow;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {  
                System.out.print("\t*");  
            }

            System.out.println();
        }
          
    }
}
class Pattern25
{
    public static void main(String arg[])
    {
        Pattern obj = new Pattern(4,4);
        obj.DisplayPattern();
    }
}
