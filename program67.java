//accept number from user and one position also And off that bit return modified number

import java.util.*;
import java.lang.*;

//0000 0000 0000 0000 0000 0000 0000 1000
//  0    0    0    0   0    0    0    8
class Bitwise
{
    public int OFFBit(int iNo,int pos)
    {
        int iResult =0;
        int iMask =0X0000008;
        iResult = iNo & iMask;
        return iResult;
    }
}
class program2
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number");
        int value= sobj.nextInt();
        System.out.println("Enter the position");
        int iPos=sobj.nextInt();

        Bitwise bobj = new Bitwise();
        int iret=bobj.OFFBit(value,iPos);
        System.out.println("updated number is : "+iret);
    }
        
}