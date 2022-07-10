//WAJP to accept two files names from user and open first file &create new file
//(second file) & copy the data from first file into newly created file
import java.lang.*;
import java.util.Scanner;
import java.io.*;
class CopyData
{
    public static void Copydatafile(String fileName,String name)
    {
        try
        {
            FileInputStream r = new FileInputStream(fileName);
            FileOutputStream w = new FileOutputStream(name);

            int i=0;
            while((i=r.read())!=-1)
            {
                w.write((char)i);       //typecast int i to char
            }
            System.out.println("Data copied Successfully");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }

    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the file name which contain the data ");
        String fileName = sobj.nextLine();

        System.out.println("Enter the file name to Create");
        String name= sobj.nextLine();

        Copydatafile(fileName,name);

    }
}