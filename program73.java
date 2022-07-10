//Accept number from user and check whether 9th and 12th bit is on or off.
import java.lang.*;
import java.util.*;
// 0000 0000 0000 0000 0000 1001 0000 0000
class Bitwise
{
    public boolean ChkBit(int iNo)
    {
        int iResult=0;
        int iMask=0X00000900;
        iResult=iNo & iMask;
        if(iResult==0)
        {
            return false;
        }
        else
        {
            return true;
        }
        
    }
}
class program3
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number");
        int value = sobj.nextInt();
        Bitwise bobj = new Bitwise();
        boolean bret = bobj.ChkBit(value);
        if(bret==true)
        {
            System.out.println("Bit is ON");
        }
        else
        {
            System.out.println("Bit is OFF");
        }
    }
}
