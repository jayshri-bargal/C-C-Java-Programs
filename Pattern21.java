//Input: Row 4 columns: 4
/*
  A  B  C  D
  A  B  C  D
  A  B  C  D
  A  B  C  D
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
        for(i=1;i<=iRow;i++)
        {
            for(j=1,ch='A';j<=iCol;j++,ch++)
            {
               
               
                System.out.print("\t"+ch);
               
            }
            System.out.println();
        }
          
    }
}
class Pattern21
{
    public static void main(String arg[])
    {
        Pattern obj = new Pattern(4,4);
        obj.DisplayPattern();
    }
}
