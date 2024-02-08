#include<iostream>
#include<string>
using namespace std;
int main()
{
    string name;                        //char name[20];
    cout<<"Enter your name : ";
    getline(cin,name);                  // getline() is a inbuilt function in c++
    //cout<<"Name is "+name+"\n";
    //cout<<"Name is "<<name<<"\n";
    cout<<"Hello "<<name<<endl;
    //return 0;
}