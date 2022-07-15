//Accept String from user and return difference between frequency of small character and frequency
//of capital characters

import java.lang.*;
import java.io.*;
import java.util.*;
class StringDemo
{
    public int CountDiff(String str)
    {
        char Arr[] = str.toCharArray();
        int count1=0,count2=0;
        for(int i=0; i < Arr.length; i++)
        {
            if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
            {
                count1++;
            }
            if((Arr[i] >= 'A') && (Arr[i] <= 'Z'))
            {
                count2++;
            }
        }
        return count1-count2;

    }
}
class program3
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sobj.nextLine();

        StringDemo obj = new StringDemo();
        int ret=0;
        ret= obj.CountDiff(str);
       
        System.out.println(" diff bet the Frequency of small & capital character is: "+ret);

    }
}