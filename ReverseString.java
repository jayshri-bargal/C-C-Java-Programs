//Accept string from user and display that string in reverse order.
import java.lang.*;
import java.util.*;
class StringX
{
    public void Reverse(String str1)
    {
        String newstr = str1.replaceAll("\\s+"," ").trim();
        
        StringBuilder sb = new StringBuilder();
        //sb.append(newstr);
        System.out.println((sb.append(newstr)).reverse());

    }
}
class ReverseString
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string");
        String str = sc.nextLine();

        StringX  obj = new StringX();
        obj.Reverse(str);
        
        
    }
}