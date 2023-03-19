import java.util.Scanner;
public class Office
{
    
    public static void main(String [] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.print("NAME: ");
        String name=s.nextLine();
        System.out.print("AGE: ");
        int age=s.nextInt();
        System.out.print("ADDRESS: ");
        String addr=s.next();
        System.out.print("PHONE NUMBER: ");
        String ph=s.next();
        System.out.print("DEPARTMENT: ");
        String dept=s.next();
        System.out.print("SPECIALIZATION: ");
        String spec=s.next();
        System.out.print("SALARY: ");
        int sal=s.nextInt();
        Manager m=new Manager();
        Employees e= new Employees();
        System.out.print("WHAT IS YOUR DESIGNATION:");
        String d=s.next();
        s.close();
        if(d.equals("Manager")||d.equals("manager"))
        {
            System.out.println("------------------------------------");
            m.manager(name,age,ph,addr,dept,spec);
            m.printSalary(sal);
        }
        else if(d.equals("Employee")||d.equals("employee"))
        {
            System.out.println("------------------------------------");
            e.employees(name,age,ph,addr,dept,spec);
            e.printSalary(sal);
        }
    }
}