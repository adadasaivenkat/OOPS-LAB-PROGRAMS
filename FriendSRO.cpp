#include<iostream>
#include<string>
using namespace std;
class Box
{
    private:
        float Boxlength;
        float Boxwidth;
        float Boxheight;
    public: 
        void boxArea(float length,float width,float height)        //Member function defiend inside class
        {
            Boxlength=length;
            Boxwidth=width;
            Boxheight=height;
            cout<<"Area of the box is : "<<2*((Boxlength*Boxwidth)+(Boxwidth*Boxheight)+(Boxheight*Boxlength))<<endl;
        }
        void boxVolume(float length,float width,float height);
        friend void displayBoxDimensions(Box obj);
        inline void displayWelcomeMessage()
        {   
            cout<<"Hi, Welcome to the program!!"<<endl;
        }
};
void Box::boxVolume(float length, float width, float height)    //Member function defined oustide class
{
    /*Boxlength=length;
    Boxwidth=width;
    Boxheight=height;*/
    cout<<"Volume of the box is : "<<Boxlength*Boxwidth*Boxheight<<endl;
}
void displayBoxDimensions(Box obj)
{
    cout<<"Box dimensions"<<endl;
    cout<<"Length : "<<obj.Boxlength<<endl;
    cout<<"Width : "<<obj.Boxwidth<<endl;
    cout<<"Height : "<<obj.Boxheight<<endl;
}
int main()
{
    Box obj;
    obj.displayWelcomeMessage();
    float length,width,height;
    cout<<"Enter length, width and height of the box : ";
    cin>>length>>width>>height;
    obj.boxArea(length,width,height);
    obj.boxVolume(length,width,height);
    displayBoxDimensions(obj);
}