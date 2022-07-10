//accept number from user And on its first 4th bit of that number
import java.lang.*;
import java.util.*;
//0000 0000 0000 0000 0000 0000 0000 1000
//  0    0    0    0    0    0    0    8
class Bitwise
{
    public int Togglebit(int iNo)
    {
        int iMask=0X00000008;
        int iResult=0;
        iResult= iNo | iMask;
        return iResult;
    }
}
class program4
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number");
        int value =sobj.nextInt();
        Bitwise bobj = new Bitwise();
        int iret=bobj.Togglebit(value);
        System.out.println("updated value is :  "+iret);
    }
}