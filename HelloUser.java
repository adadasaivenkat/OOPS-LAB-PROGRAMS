import java.util.*;
public class HelloUser
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        String name;
        System.out.print("Enter your name : ");
        name=read.nextLine();
        System.out.print("Hello "+name);
        read.close();
    }
}
