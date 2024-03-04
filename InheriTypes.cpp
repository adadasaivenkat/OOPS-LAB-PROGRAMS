/*Demonstrate different types of inheritance in C++.*/
#include<iostream>
using namespace std;
class A
{
    public:
        void a()
        {
            cout<<"I'm class A"<<endl;
        }
};
class B
{
    public:
        void b()
        {
            cout<<"I'm class B"<<endl;
        }
};

// Simple Inheritance
class C : public A
{
    public:
    void c()
    {
        cout<<"I'm class C"<<endl;
    } 
};

// Multilevel Inheritance
class D : public A
{
    public:
    void d()
    {
        cout<<"I'm class D"<<endl;
    }
};
class E : public D
{
    public:
    void e()
    {
        cout<<"I'm class E"<<endl;
    }
};

// Multiple Inheritance
class F : public A, public B
{
    public:
    void f()
    {
        cout<<"I'm class F"<<endl;
    }
};

// Hierarchial Inheritance
class G : public A
{
    public:
    void g()
    {
        cout<<"I'm class G"<<endl;
    }
};
class H : public A
{
    public:
    void h()
    {
        cout<<"I'm class H"<<endl;
    }
};

// Hybrid Inheritance
class I : public C, public B
{
    public:
    void i()
    {
        cout<<"I'm class I"<<endl;
    } 
};
int main()
{
    // Simple Inheritance
    cout<<"Simple Inheritance"<<endl;
    C obj1;
    obj1.a();
    obj1.c();

    // Multilevel Inheritance
    cout<<"Multilevel Inheritance"<<endl;
    E obj2;
    obj2.a();
    obj2.d();
    obj2.e();

    // Multiple Inheritance
    cout<<"Multiple Inheritance"<<endl;
    F obj3;
    obj3.a();
    obj3.b();
    obj3.f();

    // Hierarchial Inheritance
    cout<<"Hierarchial Inheritance"<<endl;
    G obj4;
    obj4.a();
    obj4.g();

    H obj5;
    obj5.a();
    obj5.h();

    // Hybrid Inheritance
    cout<<"Hybrid Inheritance"<<endl;
    I obj6;
    obj6.a();
    obj6.c();
    obj6.i();
    obj6.b();

    return 0;
}