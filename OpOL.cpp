#include<iostream>
using namespace std;
class Add
{
    public:
        float a,b,c;
        Add(float n1, float n2, float n3)
        {
            a=n1,b=n2,c=n3;
        }
        Add operator+(Add &obj)
        {
            Add temp(0,0,0);
            temp.a=a+obj.a;
            temp.b=b+obj.b;
            temp.c=c+obj.c;
            return temp;
        }
};
int main()
{
    float n1,n2,n3;
    cout<<"Enter three values for object1 : "<<endl;
    cin>>n1>>n2>>n3;
    Add o1(n1,n2,n3);
    cout<<"Enter three values for object2 : "<<endl;
    cin>>n1>>n2>>n3;
    Add o2(n1,n2,n3), add=o1+o2;
    cout<<"Addition : "<<add.a<<" , "<<add.b<<" and "<<add.c<<endl;
    return 0;
}