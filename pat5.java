public class pat5 
{
    public static void main(String [] args)
    {
        pat5 p= new pat5();
        p.pattern();
    }    
    public void pattern()
    {
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=i;j++)  
            {
                System.out.print("*");
            } 
            System.out.println();
        }
        for (int i=4;i>0;i--)
        {
            for (int j=1;j<=i;j++)  
            {
                System.out.print("*");
            } 
            System.out.println();
        }
    }
}
