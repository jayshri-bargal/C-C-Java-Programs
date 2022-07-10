//accept number from user and one position also And check whether bit 
//at that position is  on or off, if bit is one return true otherwise return false.import java .lang.*;
import java.util.*;
import java.lang.*;

//0000 0000 0000 0000 0000 0000 0000 0010
//
class Bitwise
{
    public boolean ChkBit(int iNo,int pos)
    {
        int iResult =0;
        int iMask =0X00000002;
        iResult = iNo & iMask;
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
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number");
        int value= sobj.nextInt();
        System.out.println("Enter the position");
        int iPos=sobj.nextInt();

        Bitwise bobj = new Bitwise();
        boolean bret=bobj.ChkBit(value,iPos);
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