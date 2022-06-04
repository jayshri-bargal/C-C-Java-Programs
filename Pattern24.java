//Input: Row 4 columns: 4
/*
  a
  a  b 
  a  b  c
  a  b  c  d
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
            for(j=1,ch='a';j<=i;j++,ch++)
            {  
                if((j==1) || (i==j) || (i==iRow) || (i>j))
                {
                    System.out.print("\t"+ch); 
                }
                else
                {
                    System.out.print("\t");
                }
            }

            System.out.println();
        }
          
    }
}
class Pattern24
{
    public static void main(String arg[])
    {
        Pattern obj = new Pattern(4,4);
        obj.DisplayPattern();
    }
}
