//accept one number from user accept one position from user and off 
//7th & 10 th bit of that number

//0000 0000 0000 0000 0000 0010 0100 0001             //  I/P: 577    O/P:  1
//  0    0   0    0     0  0000 0000   1

import java.lang.*;
import java.util.*;
class Bitwise
{
    public int OffBit(int iNo)
    {
        int iResult=0;
        int iMask=0X00000001;
        iResult = iNo & iMask;
        return iResult;
    }
}
class program5
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Entter number");
        int value = sobj.nextInt();
        Bitwise bobj = new Bitwise();
        int iret = bobj.OffBit(value);
        System.out.println("updated value is :"+iret );
    }
}