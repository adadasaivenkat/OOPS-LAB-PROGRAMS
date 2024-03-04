class A
{
    public void a()
    {
        System.out.println("I'm class A");
    }
}
class B
{
    public void b()
    {
        System.out.println("I'm class B");
    }
}

// Simple Inheritance
class C extends A
{
    public void c()
    {
        System.out.println("I'm class C");
    } 
}

// Multilevel Inheritance
class D extends A
{
    public void d()
    {
        System.out.println("I'm class D");
    } 
}
class E extends D
{
    public void e()
    {
        System.out.println("I'm class E");
    } 
}

// Multiple Inheritance
// Java doesn't support Multiple Inheritance

// Hierarchial Inheritance
class F extends A
{
    public void f()
    {
        System.out.println("I'm class F");
    } 
}
class G extends A
{
    public void g()
    {
        System.out.println("I'm class G");
    } 
}

// Hybrid Inheritance
// Java doesn't support Hybrid Inheritance

public class InheriTypes
{
    public static void main(String[] args)
    {
        // Simple Inheritance
        System.out.println("Simple Inheritance");
        C obj1=new C();
        obj1.a();
        obj1.c();

        // Multilevel Inheritance
        System.out.println("Multilevel Inheritance");
        E obj2=new E();
        obj2.a();
        obj2.d();
        obj2.e();

        // Hierarchial Inheritance
        System.out.println("Hierarchial Inheritance");
        F obj3=new F();
        obj3.a();
        obj3.f();

        G obj4=new G();
        obj4.a();
        obj4.g();
    }
}