//Program to convert string to integer (no space and letters greater than s)
import java.util.Scanner;
public class w1a3
{
    public static void main(String args[])
    {
        String a;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string:");
        a=s.nextLine();
        int b = Integer.parseInt(a,29);
        System.out.println(b);
        s.close();
    };
}