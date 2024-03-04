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
class Child : public Parent
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
    cout<<obj.a<<endl;
    // obj.b and obj.c are inaccessible here
    // cout<<obj.b<<" "<<obj.c<<endl;
    // Error: 'b', and 'c' are not accessible

    obj.display(); // Accessing a and b within Child

    SubChild obj2;
    cout<<obj2.a<<endl;
    // obj2.b and obj2.c are inaccessible here
    // cout<<obj2.b<<" "<<obj2.c<<endl;
    // Error: 'b', and 'c' are not accessible

    obj2.display(); // Accessing a and b within SubChild
    
    return 0;
}