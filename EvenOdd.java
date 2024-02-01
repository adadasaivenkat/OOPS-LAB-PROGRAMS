import java.util.*;
public class EvenOdd
{
    public static void main(String args[])
    {
        Scanner read=new Scanner(System.in);
        int num;
        System.out.print("Enter a positive integer : ");
        num=read.nextInt();
        if(num==0)
        {
            System.out.print("The given number "+num+" is neither even nor odd");
        }
        else if(num>0)
        {
            if(num%2==0)
            {
                System.out.print("The given number "+num+" is an even number");
            }
            else
            {
                System.out.print("The given number "+num+" is an odd number");
            }
        }
        else
        {
            System.out.print("Please enter a positive number!");
        }
        read.close();
    }
}