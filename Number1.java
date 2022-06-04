//program to display 1 to 5 on screen
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
    public void Number1()
    {
        int iCnt=0;
        for(iCnt=1;iCnt<=iNo;iCnt++)
        {
            System.out.println(+iCnt);
        }
    }
}
class Number1
{
    public static void main(String arg[])
    {
        Number obj = new Number();
        obj.Accept();
        obj.Display();
        obj.Number1();
    }
}