//Input : 4
// Output : 10  (1+2+3+4)

// Input : 5
// Output : 15  (1+2+3+4+5)
import java.lang.*;
import java.util.*;

class Number
{
    private int iNo;

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number");
        this.iNo =sobj.nextInt();
    }
    public void Display()
    {
        System.out.println("the Value is:"+this.iNo);
    }
    public int DisplaySumNumbers()
    {
        int iCnt=0,Sum=0;
        for(iCnt=1;iCnt<=iNo;iCnt++)
        {
            Sum=Sum+iCnt;
        }
        return Sum;
    }
}
class SumNumbers
{
    public static void main(String arg[])
    {
        Number obj = new Number();
        int iRet=0;
        obj.Accept();
        obj.Display();
        iRet=obj.DisplaySumNumbers();
        System.out.println("Summation of numbers are:"+iRet);
    }
}