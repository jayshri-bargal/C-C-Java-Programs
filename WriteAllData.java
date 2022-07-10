//write java program to accept directory name from user & write the data of all files along with
//its name & size of each file into one newly created file named as "Marvellous.txt."
import java.lang.*;
import java.io.*;
import java.util.*;

class WriteAllData
{
    public static void main(String args[])throws IOException
    {
        //create directory
        File dir = new File("C:\\Users\\shivansh\\Desktop\\Assignment 44\\Book");

        //create object of printwriter for Marvellous.txt
        PrintWriter pw = new PrintWriter("Marvellous.txt");

        // get list of all files name in form of String Array
        String fileNames[] = dir.list();

        //loop for reading the contents of all the files in the directory

        for(String fileName : fileNames)
        {
            System.out.println("Readimg from  "+fileName);
            File f = new File(dir,fileName);
            BufferedReader br = new BufferedReader(new FileReader(f));
            pw.println("Contents of file "+fileName);
            System.out.println("Size  of file is  "+f.length());

            //read from current file
            String line = br.readLine();
            while(line != null)
            {
                pw.println(line);
                line = br.readLine();
            }
           
            pw.flush();
        }
        System.out.println("Reading from all files " + " in directory " +dir.getName() + " Completed ");

        File fobj = new File("Marvellous.txt");
        if(fobj.exists())
        {
            System.out.println("Size of Marvellous.txt file is  "+fobj.length());
        }
        else
        {
            System.out.println("File does not exist.....");
        }
    }
}

        
