#include<iostream>
#include<string>
using namespace std;
class MethodOL
{
    public:
        void print(int num){cout<<"Integer is "<<num<<endl;}
        void print(float num){cout<<"Floating point number is "<<num<<endl;}
        void print(string name){cout<<"String is "<<name<<endl;}
};
int main()
{
    MethodOL o1;
    o1.print(3);
    o1.print(5.78f);    //Use the float literal to ensure the correct overload is called
    o1.print("Hello!");
    return 0;
}