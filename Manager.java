public class Manager extends Member
{
    String spec,dept;
    public void manager(String name,int age,String ph,String addr,String dept,String spec)
    {
        System.out.println("NAME: "+name);
        System.out.println("AGE: "+age);
        System.out.println("PHONE NUMBER: "+ph);
        System.out.println("DEPARTMENT: "+dept);
        System.out.println("SPECIALIZATION: "+spec);
    }
}
