#include<iostream>
using namespace std;
void check(int num)
{
    if(num==0)
    {
        cout<<"The given number "<<num<<" is neither even nor odd"<<endl;
    }
    else if(num>0)
    {
        if(num%2==0)
        {
            cout<<"The given number "<<num<<" is an even number"<<endl;
        }
        else
        {
            cout<<"The given number "<<num<<" is an odd number"<<endl;
        }
    }
    else
    {
        cout<<"Please enter a positive number!"<<endl;
    }
}
int main()
{
    int num;
    cout<<"Enter a positive integer : ";
    cin>>num;
    check(num);
}