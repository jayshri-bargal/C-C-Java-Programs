//Display File Size
import java.lang.*;
import java.io.*;
class DisplaySize
{
    public static void main(String arg[])
    {
        
        
        File f = new File("C:\\Users\\shivansh\\Desktop\\Assignment 43\\Info.txt");
        if(f.exists())
        {
            System.out.println("File Name: "+f.getName());
            System.out.println("File location: "+f.getAbsolutePath());
            System.out.println("File Size: "+f.length());
            
        }
        else
        {
            System.out.println("File does not Exist");
        }
        
    }
}