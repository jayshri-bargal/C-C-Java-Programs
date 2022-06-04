//Input: 5
//Output: 1  2  3  4  5
import java.lang.*;
import java.util.*;
class Pattern
{
    private int iRow,iCol;
    public Pattern()
    {
        //this.iRow=a;
        //this.iCol=b;
    }
    public void Accept()
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter number of rows and Columns");
        iRow=sobj.nextInt();
        
    }
    public void DisplayPattern()
    {
        int i=0;
        for(i=1;i<=iRow;i++)
        {
            System.out.print( "  " +i);  
        }
        System.out.println();
    }
}
class Pattern2
{
    public static void main(String arg[])
    {
        Pattern obj = new Pattern();
        obj.Accept();
        obj.DisplayPattern();

        
    }
}