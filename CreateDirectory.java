//WAJP to accept directory name from user &create that directory
import java.lang.*;
import java.io.*;
import java.util.*;
class CreateDirectory
{
    public static void Directory(String name)
    {
        File file = new File(name);
        if(file.mkdir())
        {
            System.out.println("Folder is created");
        }
        else
        {
            System.out.println("Folder is not Created");
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Directory name");
        String DirectoryName = sobj.nextLine();
        Directory(DirectoryName);

    }
}