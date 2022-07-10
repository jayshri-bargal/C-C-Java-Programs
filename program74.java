//Accept number from user and two position & check whether bit at first or
//second position is ON or OFF.
import java.lang.*;
import java.util.*;
// 0000 0000 0000 0000 0000 0000 0000 1010     //I/P:10   3  7   O/P:true
//    0   0    0    0    0    0      
class Bitwise
{
    public boolean ChkBit(int iNo,int pos1,int pos2)
    {
        int iResult=0;
        int iMask=0X0000000A;
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
class program4
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number");
        int value = sobj.nextInt();
        System.out.println("Enter First position");
        int P1 = sobj.nextInt();
        System.out.println("Enter Second position");
        int P2 = sobj.nextInt();

        Bitwise bobj = new Bitwise();
        boolean bret = bobj.ChkBit(value,P1,P2);
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
