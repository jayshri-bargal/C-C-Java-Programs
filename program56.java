//Accept number from user & check whether 15 th bit is on or off
import java.lang.*;
import java.util.*;

class Bitwise
{
    public boolean CheckBit(int iNo)
    {
        int iMask=0X00001000;
        int iResult=0;
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
class program1
{
    public static void main(String arg[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Entr Number : ");
        int value = in.nextInt();

        Bitwise bobj = new Bitwise();
        boolean bret = bobj.CheckBit(value);
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
