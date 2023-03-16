public class pat3
{
    public static void main(String [] args)
    {
        pat3 p= new pat3();
        p.pattern();
    }
    public void pattern()
    {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
