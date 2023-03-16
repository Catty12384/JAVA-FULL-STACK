public class pat4
{
    public static void main(String[] args)
    {
        pat4 p=new pat4();
        p.pattern();
    }    
    public void pattern()
    {
        for(int i=0;i<5;i++)
        {
            for(int s=0;s<i;s++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=2*5-2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
