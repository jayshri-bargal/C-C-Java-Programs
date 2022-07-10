//Accept number from user & count number of ON bits in it without using % & /
import java.lang.*;
import java.util.*;

//0000 0000 0000 0000 0000 0000 0000 1011

class Bitwise
{
    public  int CountONBit(int iNo)
    {
        int iCnt=0;
        while(iNo > 0)
        {
            if((iNo & 1) == 1) 
            iCnt++;
            iNo>>=1;
           
        }
        return iCnt;
    }
}
class program1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number ");
        int value = sobj.nextInt();
        Bitwise bobj = new Bitwise();
        int iret= bobj.CountONBit(value);
        System.out.println("Number of  ON bits Are  :"+iret);
    }
}