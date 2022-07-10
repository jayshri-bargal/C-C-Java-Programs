//accept number from user And toggle 7th and 10 bit of that number
import java.lang.*;
import java.util.*;
//0000 0000 0000 0000 0000 0010 0100 0000
//   0   0    0    0    0    2    4    0
class Bitwise
{
    public int Togglebit(int iNo)
    {
        int iMask=0X00000240;
        int iResult=0;
        iResult= iNo ^ iMask;
        return iResult;
    }
}
class program3
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