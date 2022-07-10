//WAJP to accept file name from user & check whether that file is Regular file or not
import java.lang.*;
import java.io.*;
import java.util.*;
class FileType
{
    public static void RegularFile(String fileName)
    {
        File file = new File(fileName);
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
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the file name");
        String filename = sobj.nextLine();

        RegularFile(filename);

    }
}