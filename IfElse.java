/*
0 to 35    Fail
35 to 50   Pass Class
50 to  70   Second Class
60 to 70    First class
70 to 100  First class with distinction
*/

import java.lang.*;
import java.util.*;

import javax.lang.model.util.ElementScanner14;

class Number
{
    private int Marks;

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number");
        this.Marks = sobj.nextInt();
    }
    public void Display()
    {
        System.out.println("The Student Marks is "+this.Marks);
    }
    public void Student()
    {
        if((Marks>=0) && (Marks<35))
        System.out.println("Fail");

        else if((Marks>=35) && (Marks<=50))
        System.out.println("Pass Class");

        else if((Marks>=50) && (Marks<=70))
        System.out.println("Second Class");

       else if((Marks>=60) && (Marks<=70))
        System.out.println("First Class");

       else if((Marks>=70) && (Marks<=100))
        System.out.println("First Class with Distinction");

        else
        {
            System.out.println("Marks is Invalid");
        }
    }
     
        
}

class IfElse
{
    public static void main(String arg[])
    {
        Number obj = new Number();
        int iRet=0;
        obj.Accept();
        obj.Display();
        obj.Student();
        
    
    }
       
}
