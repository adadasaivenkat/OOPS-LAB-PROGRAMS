#include<iostream>
#include<iomanip>
#ifndef PI
#define PI 3.14159265359
#endif
#include"computeArea.h"
using namespace std;
int main()
{
    double r,area;
    cout<<"Enter radius : ";
    cin>>r;
    #ifdef PI
    area=computeArea(r);
    cout<<"Area of circle is "<<fixed<<setprecision(3)<<area<<endl;
    #endif
}