//Accept String from user and count number of capital characters
import java.lang.*;
import java.io.*;
import java.util.*;
class program1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();
        int count=0;
        for(int i=0; i < Arr.length; i++)
        {
            if((Arr[i] >= 'A') && (Arr[i] <= 'Z'))
            {
                count++;
            }
        }
        System.out.println("Number of Capital Characters are: "+count);

    }
}