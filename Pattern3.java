//Input: 5
//Output: 5 4 3 2 1
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
        System.out.println("enter number of rows");
       
        for(i=iRow;i>=1;i--)
        {
            System.out.println("  " +i);
        }
    }

}
class Pattern3
{
    public static void main(String arg[])
    {
        Pattern obj = new Pattern(5,4);
        obj.DisplayPattern();
    }
}
