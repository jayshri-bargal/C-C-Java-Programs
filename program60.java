//Accept number from user & check whether first and last bit is on or off 
//first bit means bit number 1 & last bit means bit number 32
import java.lang.*;
import java.util.*;
//1000 0000 0000 0000 0000 0000 0000 0001
//  1     0  0     0    0    0    0   1
class Bitwise
{
    public boolean CheckBit(int iNo)
    {
        int iMask=0X10000001;
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
class program5
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
