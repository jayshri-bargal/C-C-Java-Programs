//Accept Number from user And Check Whether it is Prime or not
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
        System.out.println("The value is "+this.iNo);
    }
    public Boolean CheckPrime()
    {
        if(iNo<0)
        {
            iNo=-iNo;
        }
        
            if((iNo%2)!=0)
            {
                return true;
            }
            else
            {
                return false;
            }
            
        
        
    }
    
}

class Prime
{
    public static void main(String arg[])
    {
        Number obj = new Number();
        Boolean bRet=false;

        obj.Accept();
        obj.Display();
        bRet=obj.CheckPrime();
        if(bRet==true)
        {
            System.out.println("Number is Prime ");
        }
        else
        {
            System.out.println("Number is not Prime");
        }
        
    }
}
