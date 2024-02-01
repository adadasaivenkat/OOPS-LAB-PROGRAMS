import java.util.*;
public class Calculator
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        double n1,n2;
        System.out.println("Enter two numbers : ");
        n1=read.nextDouble();
        n2=read.nextDouble();
        System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division");
        int choice;
        System.out.print("Enter your choice : ");
        choice=read.nextInt();
        if(choice==1)
        {
            System.out.print("Addition of "+n1+" and "+n2+" is "+(n1+n2));
        }
        else if(choice==2)
        {
            System.out.print("Subtraction of "+n1+" and "+n2+" is "+(n1-n2));
        }
        else if(choice==3)
        {
            System.out.print("Multiplication of "+n1+" and "+n2+" is "+(n1*n2));
        }
        else
        {
            if(n2!=0)
                System.out.print("Division of "+n1+" and "+n2+" is "+(n1/n2));
            else
            {
                System.out.print("Can't divide by zero!");
            }
        }
        read.close();
    }
}