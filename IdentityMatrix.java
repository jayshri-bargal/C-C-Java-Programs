//write a program which accept matrix from user and check whether the matrix is identity matrix or not
import java.lang.*;
import java.util.*;
class ArrayX
{
    public int iRow;
    public int iCol;
    public int Arr[][];

public ArrayX(int a,int b)
{
    this.iRow = a;
    this.iCol = b;
    Arr = new int[iRow][iCol];
}

public void Accept()
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Elements of Array");
    for(int i= 0; i<iRow;i++)
    {
        for(int j=0;j<iCol;j++)
        {
            Arr[i][j] = sc.nextInt();
        }
    }
}
public void Display()
{
    for(int i = 0; i < iRow; i++)
    {
        for(int j = 0; j<iCol;j++)
        {
            System.out.print(Arr[i][j]+" ");
        }
        System.out.println();
    }
}
public boolean ChkIdentity()
{
    for(int i = 0; i < iRow; i++)
    {
        for(int j = 0; j < iCol;j++)
        {
            if((i==j) && (Arr[i][j])!=1)
            {
                return false;
            }
        }
       
    }
    return true;
}
}
class IdentityMatrix
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows of Matrix");
        int X = sc.nextInt();

        System.out.println("Enter the number of Columns of Matrix");
        int Y = sc.nextInt();
        ArrayX  obj = new ArrayX(X,Y);
        obj.Accept();
        obj.Display();
        boolean ret=obj.ChkIdentity();
        if(ret==true)
        {
            System.out.println("Matrix is Identity");
        }
        else
        {
            System.out.println("Matrix is not Identity");
        }

        
    }
}

    
