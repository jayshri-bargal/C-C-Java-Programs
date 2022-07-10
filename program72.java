//Accept Two numbers from user & count number of ON bits in it without using % & /
import java.lang.*;
import java.util.*;

class Bitwise
{
    public  int CountONBit(int iNo1,int iNo2)
    {
        
    }
}
class program2
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter First number ");
        int value1 = sobj.nextInt();
        System.out.println("Enter Second number ");
        int Value2 = sobj.nextInt();
        
        Bitwise bobj = new Bitwise();
        int iret= bobj.CountONBit(value1,Value2);
        System.out.println("Number of  ON bits Are  :"+iret);
    }
}