//accept number from user and one position also And toggle that bit return modified number

import java.util.*;
import java.lang.*;

//0000 0000 0000 0000 0000 0000 0000 0100
//
class Bitwise
{
    public int ToggleBit(int iNo,int pos)
    {
        int iResult =0;
        int iMask =0X0000004;
        iResult = iNo ^ iMask;
        return iResult;
    }
}
class program4
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number");
        int value= sobj.nextInt();
        System.out.println("Enter the position");
        int iPos=sobj.nextInt();

        Bitwise bobj = new Bitwise();
        int iret=bobj.ToggleBit(value,iPos);
        System.out.println("updated number is : "+iret);
    }
        
}