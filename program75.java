//Accept number from user and accept range of position toggle all bits from that range

import java.lang.*;
import java.util.*;
// 0000 0000 0000 0000 0000 0011 1000 0001     //I/P:897   9  13   O/P:879
//    0   0    0    0    0  1100   8   1   
class Bitwise
{
    public int ChkBit(int iNo,int pos1,int pos2)
    {
        int iResult=0;
        int iMask=0X00000C00;
        iResult=iNo ^ iMask;
       return iResult;
        
    }
}
class program5
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
        int bret = bobj.ChkBit(value,P1,P2);
        System.out.println("Toggle all bits from range 9 to 13 are  "+bret);
       
    }
}
