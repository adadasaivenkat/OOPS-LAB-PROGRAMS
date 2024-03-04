#include<iostream>
using namespace std;
class A
{
    public:
        int a=10;
        void displayA()
        {   
            cout<<"I'm class A"<<endl;
        }
};
// Class B inherits virtually from class A to avoid ambiguity
class B : public virtual A
{
    public:
        int b=20;
        void display()
        {
            cout<<"I'm class B"<<endl;
        }
};
// Class C inherits virtually from class A to avoid ambiguity
class C : public virtual A
{
    public:
        void display()
        {
            cout<<"I'm class C"<<endl;
        }
};
// Class D inherits from both B and C, which inherit virtually from A
class D : public B, public C
{
    public:
        void show()
        {
            cout<<a<<endl;
            displayA();
            B::display();   // Specify which display function to call
            cout<<b<<endl;
            C::display();
        }
};
int main()
{
    D obj;
    obj.show();
    
    return 0;
}