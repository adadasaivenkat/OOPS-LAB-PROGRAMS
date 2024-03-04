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
class Child : private Parent
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
        // Inacessible members: a, b and c
        // cout<<a<<" "<<" "<<b<<" "<<c<<endl;
        // cout<<c<<endl; // Error: 'a', 'b', and 'c' are not accessible
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
    
    return 0;
}