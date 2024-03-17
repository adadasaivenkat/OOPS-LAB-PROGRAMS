#include <iostream>
using namespace std;
class Base
{
public:
    void print()
    {
        cout << "This is a base class" << endl;
    }
};
class Derived : public Base
{
public:
    void print()
    {
        cout << "This is a Derived class" << endl;
    }
};
int main()
{
    Derived obj;
    obj.print();
    return 0;
}