//WAP which create Jagged Array Number of rows &size of each row should be Accepted from user

import java.lang.*;
import java.util.*;
class ArrayX
{
    private int Arr[][];
    public ArrayX(int size)
    {
        Arr = new int[size][];
        //this.size=Arr[][];
    }
    void Accept()
    {
     Scanner sobj= new Scanner(System.in);
        System.out.println("Enter the Number of Columns for each Row in jagged Array");
        for(int i=0; i<Arr.length; i++)
        {
            Arr[i] = new int[sobj.nextInt()];
        }
        System.out.println("Enter the elements for each row");
        for(int i=0;i<Arr.length;i++)
        {
            for(int j=0; j < Arr[i].length; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

    }
    void Display()
    {
        System.out.println("Elements in jagged Array Are:");
        for(int i=0;i<Arr.length;i++)
        {
            for(int j=0; j < Arr[i].length; j++)
            {
                System.out.print(Arr[i][j] +"  ");
            }
            System.out.println();
        }
    }
}
class JaggedA
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter the number of Rows for Jagged Array");
        int Length=sobj.nextInt();

        ArrayX obj = new ArrayX(Length);
        obj.Accept();
        obj.Display();
        
    }
}