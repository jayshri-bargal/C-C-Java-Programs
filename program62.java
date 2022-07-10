//accept number from user And toggle 7th bit of that number
import java.lang.*;
import java.util.*;
//0000 0000 0000 0000 0000 0000 0100 0000
//   0   0    0    0    0    0    4    0
class Bitwise
{
    public int Togglebit(int iNo)
    {
        int iMask=0X00000040;
        int iResult=0;
        iResult= iNo ^ iMask;
        return iResult;
    }
}
class program2
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