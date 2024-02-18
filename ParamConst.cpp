#include<iostream>
#include<string>
using namespace std;
class Student
{
    private:
        string S_collegeName="";
        int S_collegeCode=0;
        string S_fullName="";
        double S_semPercentage=0.0;
    public:
        Student()       //Default constructor
        {
            S_collegeName="MVGR";
            S_collegeCode=33;
            cout<<"Student object created by deafult constructor."<<endl;
        }
        Student(string fullName,double semPercentage)   //Parameterized constructor
        {
            S_fullName=fullName;
            S_semPercentage=semPercentage;
            cout<<"Student object created by Parameterized constructor."<<endl;
        }
        //Destructor
        ~Student()
        {
            cout<<"Student object destroyed."<<endl;
        }
        void display()
        {
            cout<<"STUDENT DETAILS"<<endl;
            cout<<"Student full name : "<<S_fullName<<endl;
            cout<<"Student sem percentage : "<<S_semPercentage<<endl;
            cout<<"Student college name : "<<S_collegeName<<endl;
            cout<<"Student college code : "<<S_collegeCode<<endl;
        }
};
int main()
{
    Student def_s1;
    def_s1.display();
    cout<<endl;
    string fullName;
    double semPercentage;
    cout<<"Enter student's full name : ";
    getline(cin,fullName);
    cout<<"Enter student's sem percentage : ";
    cin>>semPercentage;
    Student par_s2(fullName,semPercentage);
    par_s2.display();
    cout<<endl;
    return 0;
}