class A
{
    public void a()
    {
        System.out.println("I'm class A");
    }
}
class B extends A
{
    public void b()
    {
        System.out.println("I'm class B");
    }
}
class C extends A
{
    public void c()
    {
        System.out.println("I'm class C");
    } 
}
/* 
class D extends B,C   // WRONG SYNTAX
{

}
*/
// THE PROBLEM : Java doesn't support Multiple Inheritance
public class Diamond
{
    public static void main(String[] args)
    {
        B b=new B();
        b.a();
        b.b();

        C c=new C();
        c.a();
        c.c();

        /*
        Java doesn't support Multiple Inheritance.     
        To address the absence of multiple inheritance 
        in Java, you can employ other mechanisms such as 
        interfaces or composition to achieve similar results. 
        */
    }
}