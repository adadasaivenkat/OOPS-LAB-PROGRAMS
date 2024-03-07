#include<iostream>
using namespace std;
class AccessSpecifierDemo
{
    private: int priVar;
    protected: int proVar;
    public: int pubVar;
    public: void setVar(int priValue,int proValue, int pubValue)
    {
        priVar=priValue;
        proVar=proValue;
        pubVar=pubValue;
    }
    public: void getVar()
    {
        cout<<"Private, Protected and Public variables are "<<priVar<<", "<<proVar<<" and "<<pubVar<<endl;
    }
};
int main()
{
    AccessSpecifierDemo obj;
    int priValue,proValue,pubValue;
    cout<<"Enter private, protected and public variables values (each in a separate line): "<<endl;
    cin>>priValue>>proValue>>pubValue;
    obj.setVar(priValue,proValue,pubValue);
    obj.getVar();
}