#include<iostream>
using namespace std;
const double PI=3.14;
// Abstract class
class Shape
{
    public:
        virtual double area()=0;
        virtual double perimeter()=0;
        void displayType()
        {
            cout<<"This is a shape."<<endl;
        }
};
class Circle : public Shape
{
    private:
        double radius;
    public:
        Circle(double radius)
        {
            this->radius=radius;
        }
        double area()
        {
            return PI*radius*radius;
        }
        double perimeter()
        {
            return 2*PI*radius;
        }
};
class Rectangle : public Shape
{
    private:
        double l,w;
    public:
        Rectangle(double l, double w)
        {
            this->l=l;
            this->w=w;
        }
        double area()
        {
            return l*w;
        }
        double perimeter()
        {
            return 2*(l+w);
        }
};
int main()
{
    //Shape shape;   // Error: Cannot instantiate an abstract class
    Circle o1(5.894665);
    o1.displayType();
    cout<<"Area and perimeter of the circle is : "<<o1.area()<<" , "<<o1.perimeter()<<endl;
    Rectangle o2(4.846, 6.846);
    o1.displayType();
    cout<<"Area and perimeter of the rectangle is : "<<o2.area()<<" , "<<o2.perimeter()<<endl;
    return 0;
}