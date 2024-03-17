public class MethodOL
{
    void print(int num){System.out.println("Integer is "+num);}
    void print(float num){System.out.println("Floating point number is "+num);}
    void print(String name){System.out.println("String is "+name);}
    public static void main(String[] args)
    {
        MethodOL obj=new MethodOL();
        obj.print(3);
        obj.print(5.78f);
        obj.print("Hello!");
    }
}