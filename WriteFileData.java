import java.lang.*;
import java.io.*;

//write a java program to accept directory name from user & write data of all files into one newly
//created file
class WriteFileData
{
    public static void main(String arg[])throws IOException
    {
        File fobj = new File("C:\\Users\\shivansh\\Desktop\\Assignment 44\\Book");
        PrintWriter pw = new PrintWriter("Marvellous.txt");
        String fileNames[] = fobj.list();
        for(String fileName : fileNames)
        {
            System.out.println("Reading from "+fileName);
            File f = new File(fobj,fileName);
            BufferedReader br = new BufferedReader(new FileReader(f));
            //pw.println("File Name  "+fileName);
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