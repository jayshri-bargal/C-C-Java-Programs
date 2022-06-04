//check Number is perfect number or not
import java.lang.*;
import java.util.*;

class Number
{
    private int iNo;

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number");
        this.iNo = sobj.nextInt();
    }
    public void Display()
    {
        System.out.println("perfect numbers in between 1 to 100 are:");
    }
    public void CheckPerfect()
    {
        int iCnt=0,Sum=0;
        for(iCnt=1;iCnt<=100; iCnt++)
        {
            int p=1;
            while(p<=(iCnt/2))
            {
                if((iCnt%p)==0)
                Sum=Sum+p;
                p++;

            }
            if(Sum==iCnt)
            
                System.out.println(+iCnt);
                Sum=0;
            
        }
        
    }
    
}

class Perfect2
{
    public static void main(String arg[])
    {
        Number obj = new Number();

        //obj.Accept();
        obj.Display();
        obj.CheckPerfect();
        
    }
}
