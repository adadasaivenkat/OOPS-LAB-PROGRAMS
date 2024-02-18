#include<iostream>
#include"boxArea.h"
#include"boxVolume.h"
using namespace std;
int main()
{
    float l,w,h;
    cout<<"Enter length, width and height of the box : ";
    cin>>l>>w>>h;
    boxArea(l,w,h);
    boxVolume(l,w,h);
    return 0;
}