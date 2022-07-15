//Accept String from user and count number of small characters
import java.lang.*;
import java.io.*;
import java.util.*;
class program2
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
            if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
            {
                count++;
            }
        }
        System.out.println("Number of Small Characters are: "+count);

    }
}