#include<iostream>
using namespace std;
template<typename MyDataType>
// Template Class
class TemplateClasFun
{
    public:
    void add(MyDataType a, MyDataType b)
    {
        cout << a << " + " << b << " = " << a + b << endl;
    }
    void sub(MyDataType a, MyDataType b)
    {
        cout << a << " - " << b << " = " << a - b << endl;
    }
    void mul(MyDataType a, MyDataType b)
    {
        cout << a << " + " << b << " = " << a * b << endl;
    }
    void div(MyDataType a, MyDataType b)
    {
        if(b==0)
        {
            cout<<"Divide by zero.ERROR!"<<endl;
        }
        else
        {
            cout << a << " / " << b << " = " << a / b << endl;
        }
    }
};
int main()
{
    TemplateClasFun<int> obj;
    cout << "FOR INTEGERS" << endl;
    obj.add(2, 3);
    obj.sub(2, 3);
    obj.mul(2, 3);
    obj.div(2, 3);
    obj.div(2, 0);
    cout<<"                           "<<endl;
    cout << "FOR FLOATING-POINT NUMBERS" << endl;
    TemplateClasFun<float> obj1;
    obj1.add(2.5, 3.5);
    obj1.sub(2.5, 3.5);
    obj1.mul(2.5, 3.5);
    obj1.div(2.5, 3.5);
    obj1.div(2.5, 0.0);

    return 0;
}