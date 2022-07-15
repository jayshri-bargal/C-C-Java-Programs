//Accept String from user and check whether it contain Vowels in it or not.

import java.lang.*;
import java.io.*;
import java.util.*;
class StringDemo
{
    public boolean CheckVowel(String str)
    {
        char Arr[] = str.toCharArray();
        for(int i=0; i < Arr.length; i++)
        {
          if((Arr[i]=='a') || (Arr[i]=='e') || (Arr[i]=='i')||(Arr[i]=='o')||(Arr[i]=='u'))
          {
          return true;
          }
        
        }
        return false;
    }
}
class program4
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sobj.nextLine();

        StringDemo obj = new StringDemo();
        boolean ret=false;
        ret= obj.CheckVowel(str);
        if(ret==true)
        {
            System.out.println("String Contain Vowel");
        }
        else
        {
            System.out.println("String is not Contain Vowel");
        }
       
       
    }
}