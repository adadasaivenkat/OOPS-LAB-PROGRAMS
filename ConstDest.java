import java.util.*;
class Stu
{   
    private String fullName;
    private int rollNum;
    private double semPercentage;
    private String collegeName;
    private int collegeCode;
    //Constructor
    public Stu(String name, int roll, double percent, String collegename, int collegecode)
    {
        fullName=name;
        rollNum=roll;
        semPercentage=percent;
        collegeName=collegename;
        collegeCode=collegecode;
    }
    public void display()
    {
        System.out.println("Full name of the student is "+fullName);
        System.out.println("Roll number of the student is "+rollNum);
        System.out.println("Sem percentage of the student is "+semPercentage);
        System.out.println("College name of the student is "+collegeName);
        System.out.println("College code of the student is "+collegeCode);
    }
    protected void finalize() throws Throwable
    {
        System.out.println("I'm Dead");
    }
}
public class ConstDest
{
    public static void main(String[] args)
    {   
        Scanner read=new Scanner(System.in);
        System.out.println("Enter full name, rollno, sem percentage, college name, college code (enter each in a separate line) : ");
        String name=read.nextLine();
        int roll=read.nextInt();
        double percent=read.nextDouble();
        read.nextLine();                    //Consume the newline character
        String collegename=read.nextLine();
        int collegecode=read.nextInt();
        Stu obj=new Stu(name,roll,percent,collegename,collegecode);
        obj.display();
        read.close();
        // The finalize method might not get called immediately after the object is dereferenced
        // Garbage collection in Java is not deterministic
        // Therefore, explicit System.gc() is not recommended for production code
        // But here, for demonstration, we're explicitly calling garbage collection
        // to trigger the finalize method
        obj=null;
        System.gc();
    }
}