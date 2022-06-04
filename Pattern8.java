//Input: 5
//Output: 1  *  3   *  5  
//Input:6
//output: 1  *  3  *  5  *
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
            if((i%2)==0)
            {
                System.out.print("\t*");
            }
            else
            {
                System.out.print("\t" +i);
            }
          
        }
         
    
    }

}
class Pattern8
{
    public static void main(String arg[])
    {
        Pattern obj = new Pattern(6,4);
        obj.DisplayPattern();
    }
}
