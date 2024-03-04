class Public
{
    public int a=10;
    protected int b=20;
    private int c=30;
    public int getc()
    {
        return c;
    }
}
/* 
protected class Protected
{

}
private class Private
{

}
*/
/* Declaring top-level classes as private or protected in Java is invalid 
and impractical because they would be inaccessible or overly restricted 
in usage, respectively*/
public class PPPInheri
{
    public static void main(String[] args)
    {
        Public obj=new Public();
        System.out.println("Public Variable is : "+obj.a);
        System.out.println("Protected Variable is : "+obj.b);
        // System.out.println("Private Variable is : "+obj.c);
        // The variable c is inaccessible here because it is declared as private,
        // meaning it is only accessible within the class where it is declared,it can still be accessed through a public 
        // getter method defined within the same class.
        System.out.println("Private Variable is : "+obj.getc());
    }
}
