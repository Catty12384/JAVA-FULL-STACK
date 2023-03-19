import java.util.Scanner;
public class w1a1
{
    public static void main(String args[])
    {
        int a,b;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number:");
        a=s.nextInt();
        System.out.print("Enter a number:");
        b=s.nextInt();
        System.out.println("Sum: "+(a+b));
        System.out.println("Difference: "+(a-b));
        System.out.println("Product: "+(a*b));
        System.out.println("Quotient: "+(a/b));
        s.close();
    };
}