//Display all files and size of each file
import java.lang.*;
import java.io.*;
class DisplayAllFiles
{
    public static void main(String arg[])throws IOException
    {
        File folder = new File("C:\\Users\\shivansh\\Desktop\\Assignment 43");
        File[] listofFiles = folder.listFiles();
        for(int i=0; i < listofFiles.length; i++)
        {
            if(listofFiles[i].isFile())
            {
                System.out.println("File name "+listofFiles[i].getName());
                System.out.println("File size "+listofFiles[i].length()+"  bytes");
            }
            else if(listofFiles[i].isDirectory())
            {
                System.out.println("Directory name "+listofFiles[i].getName());
            }
           
        }
    }
}