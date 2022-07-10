//write java program to accept directory from user and display names of files from that directory which aren
//reguar file.
import java.lang.*;
import java.io.*;
import java.util.*;
class DisplayRegular
{
    public static void RegularFile(String name)
    {
        File file = new File(name);
        if(file.isFile())
        {
            System.out.println("File is Regular file.");
        }
        else
        {
            System.out.println("File is Not Regular file");
        }
    }
    public static void main(String arg[])
    {
        File dir = new File("C:");
        String[] children = dir.list();
        if(children==null)
        {
            System.out.println("Either dir does not exit or it is not a Directory");

        }
        
        else
        {
            for(int i=0; i<children.length; i++)
            {
                String filename = children[i];
                System.out.println(filename);
            }
        }

    
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the file name");
        String name = sobj.nextLine();
        RegularFile(name);
    }
}