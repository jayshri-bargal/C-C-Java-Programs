//accept number from user and toggle contents of first and last nibble
//of the number. return modified number

import java.util.*;
import java.lang.*;

//1111 0000 0000 0000 0000 0000 0000 1111
//
class Bitwise
{
    public int ToggleBit(int iNo)
    {
        int iResult =0;
        int iMask =0XF000000F;
        iResult = iNo ^ iMask;
        return iResult;
    }
}
class program5
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number");
        int value= sobj.nextInt();
        //System.out.println("Enter the position");
        //int iPos=sobj.nextInt();

        Bitwise bobj = new Bitwise();
        int iret = bobj.ToggleBit(value);
        System.out.println("updated number is : "+iret);
    }
        
}