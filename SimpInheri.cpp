/*Demonstrate Simple Inheritance in CPP using a real time example.*/
#include<iostream>
#include<string>
using namespace std;
class Animal
{
    public:
        void eat()
        {
            cout<<"I can eat."<<endl;
        }
        void sleep()
        {
            cout<<"I can sleep."<<endl;
        }
};
class Dog : public Animal 
{
    public:
        string name="Puppy";
        void display()
        {
            cout<<"My name is "<<name<<"."<<endl;
        }
        void bark()
        {   
            cout<<"I can bark."<<endl;
        }
};
int main()
{
    Dog Puppy;
    Puppy.display();      // Specific to Dog
    Puppy.eat();          // Inherited from Animal
    Puppy.sleep();        // Inherited from Animal
    Puppy.bark();         // Specific to Dog

    return 0;
}