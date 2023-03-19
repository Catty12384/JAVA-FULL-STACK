import java.util.Scanner;
public class w1a8
{
    public static void main(String args[])
    {
        int j;
        Scanner s=new Scanner(System.in);
        System.out.print("Upto what do you want?: ");
        j=s.nextInt();
        w1a8 m=new w1a8();
        m.Multiplication(j);
        s.close();
       
    };
    public void Multiplication(int j)
    {
        final Scanner s=new Scanner(System.in);
        System.out.println("____________________________");
        System.out.print("\n MULTIPLICATION TABLE OF ");
        int n=s.nextInt();
        System.out.println("____________________________");
        System.out.println(" ");
        s.close();
        for(int i=1;i<=j;i++)
        {
            System.out.println("\t"+i+" x "+n+" = "+(i*n));
        }
        System.out.println(" ");
    }
}