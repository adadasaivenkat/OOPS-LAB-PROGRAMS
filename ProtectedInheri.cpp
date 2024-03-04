#include<iostream>
using namespace std;
class Parent
{
    public:
        int a=10;   // Public member
    protected:
        int b=20;   // Protected member
    private:
        int c=30;   // Private member
};
class Child : protected Parent
{
    public:
    void display()
    {
        // Inaccessible member: c
        // Accessible members: a and b
        cout<<a<<" "<<" "<<b<<" "<<endl;
        // cout<<c<<endl; // Error: 'c' is not accessible
    }
};
class SubChild : public Child
{
    public:
    void display()
    {
        // Inaccessible member: c
        // Accessible members: a and b
        cout<<a<<" "<<" "<<b<<" "<<endl;
        // cout<<c<<endl; // Error: 'c' is not accessible
    }
};
int main()
{
    Child obj;
    // obj.a and obj.b are inaccessible here
    // obj.c is inaccessible here
    // cout<<obj.a<<" "<<" "<<obj.b<<" "<<obj.c<<endl;
    // Error: 'a', 'b', and 'c' are not accessible

    obj.display(); // Accessing a and b within Child

    SubChild obj2;
    // obj2.a and obj2.b are inaccessible here
    // obj2.c is inaccessible here
    // cout<<obj2.a<<" "<<" "<<obj2.b<<" "<<obj2.c<<endl;
    // Error: 'a', 'b', and 'c' are not accessible

    obj2.display(); // Accessing a and b within SubChild
    
    return 0;
}