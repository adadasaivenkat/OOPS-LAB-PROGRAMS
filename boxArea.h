#include<iostream>
using namespace std;
void boxArea(float length, float width, float height)
{
    cout<<"Area of the box is : "<<2*((length*width)+(width*height)+(height*length))<<endl;
}