import java.util.Scanner;
public class w1a2
{
    public static void main(String args[])
    {
        int a,b;
        Scanner s=new Scanner (System.in);
        System.out.print("Enter a number: ");
        a=s.nextInt();
        System.out.print("Enter a number: ");
        b=s.nextInt();
        if(a==b)
        {
            System.out.println("Numbers are the same.");
        }
        else if(a>b)
        {
            System.out.println(a+" is greater than "+b);
        }
        else
        {
            System.out.println(b+" is greater than "+a);
        }
        s.close();
    };
}