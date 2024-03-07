import java.util.Scanner;
class AccessSpecifierDemo
{
    private int priVar;
    protected int proVar;
    public int pubVar;
    public void setVar(int priValue,int proValue, int pubValue)
    {
        priVar=priValue;
        proVar=proValue;
        pubVar=pubValue;
    }
    public void getVar()
    {
        System.out.println("Private, Protected and Public variables are "+priVar+", "+proVar+" and "+pubVar);
    }
}
public class AbsEncap
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        AccessSpecifierDemo obj=new AccessSpecifierDemo();
        int priValue,proValue,pubValue;
        System.out.println("Enter private, protected and public variables values (each in a separate line): ");
        priValue=read.nextInt();
        proValue=read.nextInt();
        pubValue=read.nextInt();
        obj.setVar(priValue,proValue,pubValue);
        obj.getVar();
        read.close();
    }
}