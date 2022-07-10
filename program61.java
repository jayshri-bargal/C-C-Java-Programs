//accept one number from user and off 7th bit of that number if it is on.return modified number
import java.lang.*;
import java.util.*;
//0000 0000 0000 0000 0000 0000 0000 1111           // I/P 79     O/P:  15
// 0     0    0    0   0    0     0
class Bitwise
{
    public int OffBit(int iNo)
    {
        int iResult=0;
        int iMask=0X0000000F;
        iResult = iNo & iMask;
        return iResult;

    }
}
class program1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number");
        int value = sobj.nextInt();
        Bitwise bobj = new Bitwise();
        int iret= bobj.OffBit(value);
        System.out.println("updated number is : "+iret);
    }
}

