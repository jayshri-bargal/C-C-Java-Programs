//WAJP to accept directory name from user and Display all names of files
//from that directory and size of each file on screen.
import java.lang.*;
import java.nio.file.Files;
import java.io.*;
import java.util.*;

import javax.lang.model.util.ElementScanner14;
class FileSize
{
  
    public static void DisplayFiles(String DName)
    {
            File folder = new File("C:\\Users\\shivansh\\Desktop\\Assignment 43");

            //implementing FilenameFilter to retive only txt files
            FilenameFilter txtFileFilter = new FilenameFilter() 
            {
                public boolean accept(File dir,String name)
                {
                    if(name.endsWith( ".txt"))
                    {
                        return true;
                        
                    }
                   /*  else if(name.endsWith(".java"))
                    {
                        return true;
                    }*/
                    else 
                    {
                        return false;
                    }
                }
            };
            //pass txtFilefilter to listfiles()method to retrive only txt file
            File[] files = folder.listFiles(txtFileFilter);
            for(File file : files)
            {
                System.out.println(file.getName());
                System.out.println("Size of files  "+file.length());
            }
          
       
    }
    public static void main(String arg[])
    {
        Scanner sobj= new Scanner(System.in);
        System.out.println("Enter the Directory name");
        String Name = sobj.nextLine();

        DisplayFiles(Name);

    }
}