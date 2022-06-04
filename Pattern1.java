//Input: 5
//Output: * * * * *
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
        int i=0,j=0;
        for(i=1;i<=iRow;i++)
        {
             System.out.print("  *");  
        }
        System.out.println();
    }
}
class Pattern1
{
    public static void main(String arg[])
    {
        Pattern obj = new Pattern();
        obj.Accept();
        obj.DisplayPattern();

        
    }
}