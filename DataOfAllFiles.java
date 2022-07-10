//write a java program to accept directory name from user and write data of all files along with
//its name into one newly created file.
import java.lang.*;
import java.util.Scanner;
import java.io.*;
class DataOfAllFiles
{
    public static void main(String arg[])throws IOException
    {
        File Fobj = new File("C:\\Users\\shivansh\\Desktop\\Assignment 44\\Book");

        PrintWriter pw = new PrintWriter("InfoSystem.txt");

        String fileNames[] = Fobj.list();
        for(String fileName : fileNames)
        {
            System.out.println("Reading from "+fileName);
            File f = new File(Fobj,fileName);
            BufferedReader br = new BufferedReader(new FileReader(f));
            pw.println("File Name  "+fileName);
            pw.println("Content of the file");
            String line = br.readLine();

            while(line != null)
            {
                pw.println(line);
                line = br.readLine();
            }
            pw.flush();
        }


    }
}