import java.util.*;
class Student
{
    private String fullName="";
    private double semPercentage=0.0;
    private String collegeName="";
    private int collegeCode=0;
    //Default constructor
    public Student()
    {
        collegeName="MVGR";
        collegeCode=33;
    }
    //Parameterized constructor
    public Student(String name,double percent)
    {
        fullName=name;
        semPercentage=percent;
    }
    public void display()
    {
        System.out.println("Full name of the student is "+fullName);
        System.out.println("Sem percentage of the student is "+semPercentage);
        System.out.println("College name of the student is "+collegeName);
        System.out.println("College code of the student is "+collegeCode);
    }
    protected void finalize() throws Throwable
    {
        System.out.println("I'm Dead");
    }
}
public class ParamConst
{
    public static void main(String[] args)
    {
        Student obj1=new Student();
        obj1.display();
        System.out.println();
        System.out.println("Enter full name, sem percentage (enter each in a separate line) : ");
        Scanner read=new Scanner(System.in);
        String name=read.nextLine();
        double percent=read.nextDouble();
        read.close();
        Student obj2=new Student(name,percent);
        obj2.display();
        // The finalize method might not get called immediately after the object is dereferenced
        // Garbage collection in Java is not deterministic
        // Therefore, explicit System.gc() is not recommended for production code
        // But here, for demonstration, we're explicitly calling garbage collection
        // to trigger the finalize method
        obj1=null;
        obj2=null;
        System.gc();
    }
}
